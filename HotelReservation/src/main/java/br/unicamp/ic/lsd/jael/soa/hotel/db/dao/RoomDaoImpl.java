package br.unicamp.ic.lsd.jael.soa.hotel.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.unicamp.ic.lsd.jael.soa.hotel.db.ConnectionFactory;
import br.unicamp.ic.lsd.jael.soa.hotel.db.DbUtil;
import br.unicamp.ic.lsd.jael.soa.hotel.db.entities.Room;

public class RoomDaoImpl implements RoomDao {

	private Connection connection;
    private Statement statement;
	
	public List<Room> getAvailableRoom(String country, String from, String to) {
		/**
			SELECT * FROM room ro 
			LEFT JOIN hotel h ON ro.hotel_id = h.hotel_id
			LEFT JOIN room_type rt ON ro.room_type_id = rt.room_type_id
			WHERE ro.country_code = 'ARG' AND rt.num_beds = 1 AND ro.num_room NOT IN (
				SELECT re.num_room FROM reservation re 
				WHERE re.reservation_from <= '2015-04-30' AND re.reservation_to >= '2015-04-27' AND re.country_code = 'ARG'
			)
		 */
		String query = "SELECT ro.num_room, h.hotel_name, ro.floor, rt.name, ro.country_code, ro.price "
				+ "FROM room ro "
				+ "LEFT JOIN hotel h ON ro.hotel_id = h.hotel_id "
				+ "LEFT JOIN room_type rt ON ro.room_type_id = rt.room_type_id "
				+ "WHERE ro.country_code = \'"+country+"\' AND rt.num_beds = 1 AND ro.num_room NOT IN ( "
				+ "SELECT re.num_room FROM reservation re "
				+ "WHERE re.reservation_from <= \'"+to+"\' AND re.reservation_to >= \'"+from+"\' AND re.country_code = \'"+country+"\'"
				+ ")";
		ResultSet rs = null;
		List<Room> roomList = new ArrayList<Room>();
		
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				Integer numRoom = rs.getInt(1);
	            String hotelName = rs.getString(2);
	            Integer floor = rs.getInt(3);
	            String roomTypeName = rs.getString(4);
	            String countryCode = rs.getString(5);
	            Float price = rs.getFloat(6);
	            
	            Room room = new Room();
	            room.setNumRoom(numRoom);
	            room.setHotelName(hotelName);
	            room.setFloor(floor);
	            room.setRoomTypeName(roomTypeName);
	            room.setCountryCode(countryCode);
	            room.setPrice(price);
	            
	            roomList.add(room);
	        }
			
		} catch (SQLException e) {
			roomList = new ArrayList<Room>();
		} finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		
		return roomList;
	}

}
