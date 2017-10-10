package br.unicamp.ic.lsd.jael.soa.car.db.entities;

public class Model {

	private Long modelId;
	private String modelName;
	private String brand;
	private Integer seats;
	private String transmission;
	
	public Long getModelId() {
		return modelId;
	}
	
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Integer getSeats() {
		return seats;
	}
	
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	
	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
}
