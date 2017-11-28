package org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.type.DateType;


@Entity
public class Location {
	@Id
	@GeneratedValue
	private int location_Id;
	private String Location_Name;
	private String fromDate;
	private String toDate;
	public String getLocation_Name() {
		return Location_Name;
	}
	public void setLocation_Name(String location_Name) {
		this.Location_Name = Location_Name;
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
	public int getLocation_id() {
		return location_Id;
	}
	public void setLocation_id(int location_id) {
		this.location_Id = location_id;
	}
	
	
	
	

}
