package br.unicamp.ic.lsd.jael.soa.hotel.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.unicamp.ic.lsd.jael.soa.hotel.process.ReservationProcess;
import br.unicamp.ic.lsd.jael.soa.hotel.ws.model.Reservation;

@WebService(endpointInterface = "br.unicamp.ic.lsd.jael.soa.hotel.ws.HotelReservation", serviceName="HotelReservation", portName="HotelReservationPort")
public class HotelReservationImpl implements HotelReservation {

	private ReservationProcess reservationProcess = new ReservationProcess();
	
	@WebMethod(operationName = "reserveRoom")
	public Reservation reserveRoom(@WebParam(name = "parameter") Reservation parameter) {
		Reservation reservation = reservationProcess.getReservationOffer(parameter);
		return reservation;
	}

}
