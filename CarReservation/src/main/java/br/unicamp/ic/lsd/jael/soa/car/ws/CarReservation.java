package br.unicamp.ic.lsd.jael.soa.car.ws;

import javax.jws.WebService;

import br.unicamp.ic.lsd.jael.soa.car.ws.model.Reservation;

@WebService()
public interface CarReservation {
	public Reservation rentCar(Reservation parameter);
	
}
