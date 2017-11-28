package org.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.type.DateType;


@Entity
public class Trip_details {
	@Id
	@Generated(value = { "" })
	private String Destination;
	private String Starting_date;
	private String return_date;
	private int No_of_days;
	private String trip_type;
	private String Mode_of_transport;
	private double trip_package;
	private int no_of_persons;
	private String getDestination() {
		return Destination;
	}
	public String getStarting_date() {
		return Starting_date;
	}
	public void setStarting_date(String starting_date) {
		Starting_date = starting_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public int getNo_of_days() {
		return No_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		No_of_days = no_of_days;
	}
	public String getTrip_type() {
		return trip_type;
	}
	public void setTrip_type(String trip_type) {
		this.trip_type = trip_type;
	}
	public String getMode_of_transport() {
		return Mode_of_transport;
	}
	public void setMode_of_transport(String mode_of_transport) {
		Mode_of_transport = mode_of_transport;
	}
	public double getTrip_package() {
		return trip_package;
	}
	public void setTrip_package(double trip_package) {
		this.trip_package = trip_package;
	}
	public int getNo_of_persons() {
		return no_of_persons;
	}
	public void setNo_of_persons(int no_of_persons) {
		this.no_of_persons = no_of_persons;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
}


