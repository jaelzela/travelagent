package br.unicamp.ic.lsd.jael.soa.hotel.db.entities;

import java.util.Date;

public class Reservation {

	private String reservationCode;
	private String document;
	private String name;
	private Date reservationFrom;
	private Date reservationTo;
	private Integer numRoom;
	
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
	
	public Date getReservationFrom() {
		return reservationFrom;
	}
	
	public void setReservationFrom(Date reservationFrom) {
		this.reservationFrom = reservationFrom;
	}
	
	public Date getReservationTo() {
		return reservationTo;
	}
	
	public void setReservationTo(Date reservationTo) {
		this.reservationTo = reservationTo;
	}
	
	public Integer getNumRoom() {
		return numRoom;
	}

	public void setNumRoom(Integer numRoom) {
		this.numRoom = numRoom;
	}
}
