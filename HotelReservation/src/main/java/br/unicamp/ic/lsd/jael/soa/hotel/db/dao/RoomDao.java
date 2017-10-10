package br.unicamp.ic.lsd.jael.soa.hotel.db.dao;

import java.util.List;

import br.unicamp.ic.lsd.jael.soa.hotel.db.entities.Room;

public interface RoomDao {
	public List<Room> getAvailableRoom(String country, String from, String to);
}
