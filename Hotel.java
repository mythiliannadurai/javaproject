package org.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	@GeneratedValue
	private int Hotel_Id;
	private String Hotel_Name;
	private String fromDate;
	private String toDate;
	private String room_type;
	private String distance;
	public int getHotel_Id() {
		return Hotel_Id;
	}
	public void setHotel_Id(int hotel_Id) {
		Hotel_Id = hotel_Id;
	}
	public String getHotel_Name() {
		return Hotel_Name;
	}
	public void setHotel_Name(String hotel_Name) {
		Hotel_Name = hotel_Name;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String roomtype) {
		this.room_type = roomtype;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
}