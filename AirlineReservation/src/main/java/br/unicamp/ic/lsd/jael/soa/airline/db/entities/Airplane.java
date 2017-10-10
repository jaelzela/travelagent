package br.unicamp.ic.lsd.jael.soa.airline.db.entities;

public class Airplane {

	private Long airplaneId;
	private Long airlineId;
	private Long modelId;
	
	public Long getAirplaneId() {
		return airplaneId;
	}
	
	public void setAirplaneId(Long airplaneId) {
		this.airplaneId = airplaneId;
	}
	
	public Long getAirlineId() {
		return airlineId;
	}
	
	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}
	
	public Long getModelId() {
		return modelId;
	}
	
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}
}
