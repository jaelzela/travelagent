package br.unicamp.ic.lsd.jael.soa.car.db.entities;

public class Car {

	private String carLicense;
	private String enterpriseName;
	private String brand;
	private String modelName;
	private String transmission;
	private float price;
	
	public String getCarLicense() {
		return carLicense;
	}
	
	public void setCarLicense(String carLicense) {
		this.carLicense = carLicense;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
