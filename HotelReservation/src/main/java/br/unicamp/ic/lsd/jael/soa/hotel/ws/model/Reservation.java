package br.unicamp.ic.lsd.jael.soa.hotel.ws.model;

public class Reservation {
	String name;
	String hotelName;
	String room;
	String arrived;
	String depart;
	String country;
	float price;

	boolean confirmation;

	public Reservation() {
	}

	public Reservation(String name, String hotelName, String room, String arrived,
			String depart, String country, float price, boolean confirmation) {
		this.name = name;
		this.hotelName = hotelName;
		this.room = room;
		this.arrived = arrived;
		this.depart = depart;
		this.country = country;
		this.price = price;
		this.confirmation = confirmation;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}

	public String getArrived() {
		return arrived;
	}

	public String getDepart() {
		return depart;
	}

	public String getName() {
		return name;
	}

	public String getRoom() {
		return room;
	}

	public void setArrived(String arrived) {
		this.arrived = arrived;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}