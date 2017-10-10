package br.unicamp.ic.lsd.jael.soa.airline.ws;

import javax.jws.WebService;

import br.unicamp.ic.lsd.jael.soa.airline.ws.model.Reservation;

@WebService()
public interface AirlineReservation {
	public Reservation bookTicket(Reservation parameter);

}
