package br.unicamp.ic.lsd.jael.soa.hotel.db.entities;

public class Room {

	private Integer numRoom;
	private String hotelName;
	private Integer floor;
	private String roomTypeName;
	private String countryCode;
	private float price;
	
	public Integer getNumRoom() {
		return numRoom;
	}
	
	public void setNumRoom(Integer numRoom) {
		this.numRoom = numRoom;
	}
	
	public Integer getFloor() {
		return floor;
	}
	
	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
