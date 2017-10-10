package br.unicamp.ic.lsd.jael.soa.airline.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.unicamp.ic.lsd.jael.soa.airline.db.ConnectionFactory;
import br.unicamp.ic.lsd.jael.soa.airline.db.DbUtil;

public class ReservationDaoImpl implements ReservationDao {

	private Connection connection;
    private Statement statement;
	
	public Integer getCountReservationByFlight(Long flightId) {
		String query = "SELECT count(*) FROM reservation WHERE flight_id = \'"+flightId+"\'";
		ResultSet rs = null;
		Integer count = new Integer(0);
		
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				count = rs.getInt(1);
	        }
			
		} catch (SQLException e) {
			count = new Integer(0);
		} finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		
		return count;
	}

}
