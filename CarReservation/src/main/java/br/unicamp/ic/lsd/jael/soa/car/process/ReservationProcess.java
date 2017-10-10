package br.unicamp.ic.lsd.jael.soa.car.process;

import java.util.List;

import br.unicamp.ic.lsd.jael.soa.car.db.dao.CarDao;
import br.unicamp.ic.lsd.jael.soa.car.db.dao.CarDaoImpl;
import br.unicamp.ic.lsd.jael.soa.car.db.entities.Car;
import br.unicamp.ic.lsd.jael.soa.car.ws.model.Reservation;

public class ReservationProcess {
	
	private CarDao carDao = new CarDaoImpl();
	
	public Reservation getReservationOffer(Reservation parameters) {
		List<Car> roomList = carDao.getAvailableCar(parameters.getCountry(), parameters.getRentStartDate(), parameters.getRentEndDate());
		Car result = new Car();
		
		Reservation reservation = new Reservation();
		reservation.setCountry(parameters.getCountry());
		reservation.setName(parameters.getName());
		reservation.setRentEndDate(parameters.getRentEndDate());
		reservation.setRentStartDate(parameters.getRentStartDate());
		reservation.setCarType("Car no found");
		reservation.setPrice(0.f);
		
		if (!roomList.isEmpty()) {
			result = roomList.get(0);
			
			reservation.setCarType(result.getBrand() + " " + result.getModelName());
			reservation.setPrice(result.getPrice());
		}
		
		return reservation;
	}
}
