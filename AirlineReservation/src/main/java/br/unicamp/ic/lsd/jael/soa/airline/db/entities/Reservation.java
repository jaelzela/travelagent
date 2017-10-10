package br.unicamp.ic.lsd.jael.soa.airline.db.entities;

public class Reservation {

	private String reservationCode;
	private String document;
	private String name;
	private String seat;
	private Long flightId;
	
	public String getReservationCode() {
		return reservationCode;
	}
	
	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}
	
	public String getDocument() {
		return document;
	}
	
	public void setDocument(String document) {
		this.document = document;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSeat() {
		return seat;
	}
	
	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
}
