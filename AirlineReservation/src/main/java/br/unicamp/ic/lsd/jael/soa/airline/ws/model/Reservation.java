package br.unicamp.ic.lsd.jael.soa.airline.ws.model;

public class Reservation {
	String name;
	String origin;
	String destination;
	String arriveDate;
	String departDate;
	String airline;
	float price;

	public Reservation() {
	}

	public Reservation(String name, String origin, String destination, String arriveDate, String departDate,
			String airline, float price) {
		this.name = name;
		this.origin = origin;
		this.destination = destination;
		this.arriveDate = arriveDate;
		this.departDate = departDate;
		this.airline = airline;
		this.price = price;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDepartDate() {
		return departDate;
	}

	public String getArriveDate() {
		return arriveDate;
	}

	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}

	public void setArriveDate(String arriveDate) {
		this.arriveDate = arriveDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}