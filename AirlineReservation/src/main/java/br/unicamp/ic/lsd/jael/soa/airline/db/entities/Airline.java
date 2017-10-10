package br.unicamp.ic.lsd.jael.soa.airline.db.entities;

public class Airline {
	
	private Long airlineId;
	private String airlineName;

	public Long getAirlineId() {
		return airlineId;
	}
	
	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}
	
	public String getAirlineName() {
		return airlineName;
	}
	
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
}
