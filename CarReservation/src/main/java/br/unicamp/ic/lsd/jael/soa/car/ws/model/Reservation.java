package br.unicamp.ic.lsd.jael.soa.car.ws.model;

public class Reservation {
	String name;
	String carType;
	String rentStartDate;
	String rentEndDate;
	String country;
	float price;

	public Reservation() {
	}

	public Reservation(String name, String carType, String rentStartDate,
			String rentEndDate, float price) {
		this.name = name;
		this.carType = carType;
		this.rentStartDate = rentStartDate;
		this.rentEndDate = rentEndDate;
		this.price = price;
	}

	public String getCarType() {
		return carType;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public String getRentEndDate() {
		return rentEndDate;
	}

	public String getRentStartDate() {
		return rentStartDate;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setRentEndDate(String rentEndDate) {
		this.rentEndDate = rentEndDate;
	}

	public void setRentStartDate(String rentStartDate) {
		this.rentStartDate = rentStartDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}