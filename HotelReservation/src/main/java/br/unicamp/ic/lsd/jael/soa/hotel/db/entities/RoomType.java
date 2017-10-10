package br.unicamp.ic.lsd.jael.soa.hotel.db.entities;

public class RoomType {

	private Long roomTypeId;
	private String name;
	private Integer numBeds;
	
	public Long getRoomTypeId() {
		return roomTypeId;
	}
	
	public void setRoomTypeId(Long roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getNumBeds() {
		return numBeds;
	}

	public void setNumBeds(Integer numBeds) {
		this.numBeds = numBeds;
	}
}
