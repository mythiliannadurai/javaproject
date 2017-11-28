package org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booked_tickets{
	@Id
	@GeneratedValue
	private String username;
	private String date_of_journey;
	private String no_of_seats;
	private String ticket_fare;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate_of_journey() {
		return date_of_journey;
	}
	public void setDate_of_journey(String date_of_journey) {
		this.date_of_journey = date_of_journey;
	}
	public String getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(String no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public String getTicket_fare() {
		return ticket_fare;
	}
	public void setTicket_fare(String ticket_fare) {
		this.ticket_fare = ticket_fare;
	}
}