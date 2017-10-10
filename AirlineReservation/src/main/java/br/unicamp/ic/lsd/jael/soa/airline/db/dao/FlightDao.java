package br.unicamp.ic.lsd.jael.soa.airline.db.dao;

import java.util.List;

import br.unicamp.ic.lsd.jael.soa.airline.db.entities.Flight;

public interface FlightDao {
	public List<Flight> getFlightByItinerario(String origin, String destination, String date);
}
