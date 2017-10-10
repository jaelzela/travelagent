package br.unicamp.ic.lsd.jael.soa.airline.process;

import java.util.List;

import br.unicamp.ic.lsd.jael.soa.airline.db.dao.FlightDao;
import br.unicamp.ic.lsd.jael.soa.airline.db.dao.FlightDaoImpl;
import br.unicamp.ic.lsd.jael.soa.airline.db.dao.ReservationDao;
import br.unicamp.ic.lsd.jael.soa.airline.db.dao.ReservationDaoImpl;
import br.unicamp.ic.lsd.jael.soa.airline.db.entities.Flight;
import br.unicamp.ic.lsd.jael.soa.airline.ws.model.Reservation;

public class ReservationProcess {
	
	private FlightDao flightDao = new FlightDaoImpl();
	private ReservationDao reservationDao = new ReservationDaoImpl();
	
	public Reservation getReservationOffer(Reservation parameters) {
		List<Flight> flightList = flightDao.getFlightByItinerario(parameters.getOrigin(), parameters.getDestination(), parameters.getDepartDate());
		Flight result = new Flight();
		
		Reservation reservation = new Reservation();
		reservation.setDestination(parameters.getDestination());
		reservation.setOrigin(parameters.getOrigin());
		reservation.setArriveDate(parameters.getArriveDate());
		reservation.setDepartDate(parameters.getDepartDate());
		reservation.setName(parameters.getName());
		reservation.setAirline("Flight no found");
		reservation.setPrice(0.f);
		
		if (!flightList.isEmpty()) {
			for (Flight flight : flightList) {
				Integer numReservations = reservationDao.getCountReservationByFlight(flight.getFlightId());
				if (numReservations < flight.getCapacity()) {
					result = flight;
					break;
				}
			}
			
			reservation.setAirline(result.getAirlineName());
			reservation.setPrice(result.getPrice());
		}
		
		return reservation;
	}
}
