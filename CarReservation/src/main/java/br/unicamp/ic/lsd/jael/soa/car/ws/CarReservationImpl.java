package br.unicamp.ic.lsd.jael.soa.car.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.unicamp.ic.lsd.jael.soa.car.process.ReservationProcess;
import br.unicamp.ic.lsd.jael.soa.car.ws.model.Reservation;

@WebService(endpointInterface = "br.unicamp.ic.lsd.jael.soa.car.ws.CarReservation", serviceName="CarReservation", portName="CarReservationPort")
public class CarReservationImpl implements CarReservation {

	private ReservationProcess reservationProcess = new ReservationProcess();
	
	@WebMethod(operationName = "rentCar")
	public Reservation rentCar(@WebParam(name = "parameter") Reservation parameter) {
		Reservation reservation = reservationProcess.getReservationOffer(parameter);
		return reservation;
	}

}
