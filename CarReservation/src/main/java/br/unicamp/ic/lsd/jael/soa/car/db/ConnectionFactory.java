package br.unicamp.ic.lsd.jael.soa.car.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static ConnectionFactory instance = new ConnectionFactory();
//	public static final String URL = "jdbc:mysql://127.2.235.2:3306/car_reservation";
//	public static final String USER = "adminVC1dv18";
//	public static final String PASSWORD = "dtCNE17GKlyn";
	public static final String URL = "jdbc:mysql://localhost:3306/car_reservation";
	public static final String USER = "root";
	public static final String PASSWORD = "1234567890";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	
	private ConnectionFactory(){
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.err.println("ERROR: enabled to connect to Database.");
		}
		return connection;
	}
	
	public static Connection getConnection() {
		return instance.createConnection();
	}
}
