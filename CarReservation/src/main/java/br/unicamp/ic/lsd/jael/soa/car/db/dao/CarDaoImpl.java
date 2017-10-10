package br.unicamp.ic.lsd.jael.soa.car.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.unicamp.ic.lsd.jael.soa.car.db.ConnectionFactory;
import br.unicamp.ic.lsd.jael.soa.car.db.DbUtil;
import br.unicamp.ic.lsd.jael.soa.car.db.entities.Car;

public class CarDaoImpl implements CarDao {
	
	private Connection connection;
    private Statement statement;

	public List<Car> getAvailableCar(String country, String from, String to) {
		/**
		 	SELECT c.car_license, e.enterprise_name, m.brand, m.model_name, m.transmission FROM car c 
			LEFT JOIN enterprise e ON c.enterprise_id = e.enterprise_id
			LEFT JOIN model m ON c.model_id = m.model_id 
			WHERE c.country_code = 'ARG' AND c.car_license NOT IN ( 
			    SELECT r.car_license FROM reservation r 
			    LEFT JOIN car ca ON ca.car_license = r.car_license
			    WHERE r.reservation_from <= '2015-04-30' AND r.reservation_to >= '2015-04-27' AND ca.country_code = 'ARG'
			)
		 */
		String query = "SELECT c.car_license, e.enterprise_name, m.brand, m.model_name, m.transmission, c.price " 
				+ "FROM car c "
				+ "LEFT JOIN enterprise e ON c.enterprise_id = e.enterprise_id " 
				+ "LEFT JOIN model m ON c.model_id = m.model_id "
				+ "WHERE c.country_code = \'" + country + "\' AND c.car_license NOT IN ("
					+ "SELECT r.car_license FROM reservation r "
					+ "LEFT JOIN car ca ON ca.car_license = r.car_license "
					+ "WHERE r.reservation_from <= \'" + to + "\' AND r.reservation_to >= \'" + from + "\' AND ca.country_code = \'" + country + "\'"
				+ ")";
		ResultSet rs = null;
		List<Car> carList = new ArrayList<Car>();

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			while (rs.next()) {
				String carLicense = rs.getString(1);
				String enterpriseName = rs.getString(2);
				String brand = rs.getString(3);
				String modelName = rs.getString(4);
				String transmission = rs.getString(5);
				Float price = rs.getFloat(6);

				Car car = new Car();
				car.setCarLicense(carLicense);
				car.setEnterpriseName(enterpriseName);
				car.setBrand(brand);
				car.setModelName(modelName);
				car.setTransmission(transmission);
				car.setPrice(price);
				
				carList.add(car);
			}

		} catch (SQLException e) {
			carList = new ArrayList<Car>();
		} finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}

		return carList;
	}

}
