package br.unicamp.ic.lsd.jael.soa.hotel.ws;

import javax.jws.WebService;

import br.unicamp.ic.lsd.jael.soa.hotel.ws.model.Reservation;

@WebService()
public interface HotelReservation {
	public Reservation reserveRoom(Reservation parameter);

}
