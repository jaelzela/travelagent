package br.unicamp.ic.lsd.jael.soa.airline.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.unicamp.ic.lsd.jael.soa.airline.process.ReservationProcess;
import br.unicamp.ic.lsd.jael.soa.airline.ws.model.Reservation;

@WebService(endpointInterface = "br.unicamp.ic.lsd.jael.soa.airline.ws.AirlineReservation", serviceName = "AirlineReservation", portName = "AirlineReservationPort")
public class AirlineReservationImpl implements AirlineReservation {

	private ReservationProcess reservationProcess = new ReservationProcess();
	
	@WebMethod(operationName = "bookTicket")
	public Reservation bookTicket(@WebParam(name = "parameter") Reservation parameter) {
		// TODO write your implementation code here:
		Reservation reservation = reservationProcess.getReservationOffer(parameter);
		return reservation;

	}

}
