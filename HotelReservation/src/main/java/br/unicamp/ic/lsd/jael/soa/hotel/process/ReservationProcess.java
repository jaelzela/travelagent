package br.unicamp.ic.lsd.jael.soa.hotel.process;

import java.util.List;

import br.unicamp.ic.lsd.jael.soa.hotel.db.dao.RoomDao;
import br.unicamp.ic.lsd.jael.soa.hotel.db.dao.RoomDaoImpl;
import br.unicamp.ic.lsd.jael.soa.hotel.db.entities.Room;
import br.unicamp.ic.lsd.jael.soa.hotel.ws.model.Reservation;

public class ReservationProcess {
	
	private RoomDao roomDao = new RoomDaoImpl();
	
	public Reservation getReservationOffer(Reservation parameters) {
		List<Room> roomList = roomDao.getAvailableRoom(parameters.getCountry(), parameters.getArrived(), parameters.getDepart());
		Room result = new Room();
		
		Reservation reservation = new Reservation();
		reservation.setArrived(parameters.getArrived());
		reservation.setConfirmation(true);
		reservation.setCountry(parameters.getCountry());
		reservation.setDepart(parameters.getDepart());
		reservation.setName(parameters.getName());
		reservation.setHotelName("Hotel no found");
		reservation.setRoom("0");
		reservation.setPrice(0.f);
		
		if (!roomList.isEmpty()) {
			result = roomList.get(0);
			
			reservation.setHotelName(result.getHotelName());
			reservation.setRoom(result.getNumRoom().toString() + " - " + result.getRoomTypeName());
			reservation.setPrice(result.getPrice());
		}
		
		return reservation;
	}
}
