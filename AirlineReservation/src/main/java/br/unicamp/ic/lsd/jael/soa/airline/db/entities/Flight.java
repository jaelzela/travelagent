package br.unicamp.ic.lsd.jael.soa.airline.db.entities;

import java.util.Date;

public class Flight {

	private Long flightId;
	private String origin;
	private String destination;
	private Date flightDate;
	private float price;
	private String airlineName;
	private String modelName;
	private Integer capacity;
	
	public Long getFlightId() {
		return flightId;
	}
	
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
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
	
	public Date getFlightDate() {
		return flightDate;
	}
	
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
}
