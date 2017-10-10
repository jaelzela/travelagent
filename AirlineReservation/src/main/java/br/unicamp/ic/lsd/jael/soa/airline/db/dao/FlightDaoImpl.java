package br.unicamp.ic.lsd.jael.soa.airline.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.unicamp.ic.lsd.jael.soa.airline.db.ConnectionFactory;
import br.unicamp.ic.lsd.jael.soa.airline.db.DbUtil;
import br.unicamp.ic.lsd.jael.soa.airline.db.entities.Flight;

public class FlightDaoImpl implements FlightDao {

	private Connection connection;
    private Statement statement;
	
	public List<Flight> getFlightByItinerario(String origin, String destination, String date) {
		/**
			SELECT * FROM flight f
			LEFT JOIN airplane a ON f.airplane_id = a.airplane_id
			LEFT JOIN model m ON a.model_id = m.model_id
			LEFT JOIN airline al ON a.airline_id = al.airline_id
			WHERE f.origin = 'PER' AND f.destination = 'ARG' AND f.flight_date = '2015-04-27'
		 */
		String query = "SELECT f.flight_id, f.origin, f.destination, f.flight_date, f.price, al.airline_name, m.model_name, m.capacity "
				+ "FROM flight f "
				+ "LEFT JOIN airplane a ON f.airplane_id = a.airplane_id "
				+ "LEFT JOIN model m ON a.model_id = m.model_id "
				+ "LEFT JOIN airline al ON a.airline_id = al.airline_id "
				+ "WHERE f.origin = \'"+origin+"\' AND f.destination = \'"+destination+"\' AND f.flight_date = \'"+date+"\'";
		ResultSet rs = null;
		List<Flight> flightList = new ArrayList<Flight>();
		
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				Long flightId = rs.getLong(1);
	            String flightOrigin = rs.getString(2);
	            String flightDestination = rs.getString(3);
	            Date flightDate = rs.getDate(4);
	            Float price = rs.getFloat(5);
	            String airlineName = rs.getString(6);
	            String modelName = rs.getString(7);
	            Integer capacity = rs.getInt(8);
	            
	            Flight flight = new Flight();
	            flight.setFlightId(flightId);
	            flight.setOrigin(flightOrigin);
	            flight.setDestination(flightDestination);
	            flight.setFlightDate(flightDate);
	            flight.setPrice(price);
	            flight.setAirlineName(airlineName);
	            flight.setModelName(modelName);
	            flight.setCapacity(capacity);
	            
	            flightList.add(flight);
	        }
			
		} catch (SQLException e) {
			flightList = new ArrayList<Flight>();
		} finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		
		return flightList;
	}

}
