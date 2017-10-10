package br.unicamp.ic.lsd.jael.soa.hotel.db.entities;

public class Hotel {

	private Long hotelId;
	private String hotelName;
	
	public Long getHotelId() {
		return hotelId;
	}
	
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}
