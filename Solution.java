package org.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the ad type ");
		String type = br.readLine();
		SessionFactory fs = new Configuration().configure().buildSessionFactory();
		Session session = fs.openSession();
		session.beginTransaction();

		User s = new User();
		s.setFirstName("dhivya");
		s.setLastName("bharathi");
		s.setMailId("dhivya@gmail.com");
		s.setAddress("salem");
		s.setPhno("9876543234");

		if (type.equals("Location")) {
			Location m = new Location();
			m.setFromDate("2-2-17");
			m.setToDate("1-2-17");
			m.setLocation_Name("switzerland");
			m.setLocation_id(52);
			session.save(m);
			session.getTransaction().commit();
			session.close();
		} 
		else if (type.equals("Hotel")) {
			Hotel t = new Hotel();
			t.setHotel_Id(123);
			t.setHotel_Name("taj");
			t.setDistance("50");
			t.setRoom_type("a/c");
			session.save(t);
			session.getTransaction().commit();
			session.close();
		}
		else if(type.equals("Map_router"))
		{
			Map_route i= new Map_route();
	        i.setRoute_name("falls road");
			i.setRoute_distance("900km");
			i.setRoute_id("123");
			session.save(i);
			session.getTransaction().commit();
			session.close();
		}
		else
		{
			 Booked_tickets n=new Booked_tickets();
			n.setUsername("dhivyamyth");
			n.setDate_of_journey("2017-1-14");
			n.setNo_of_seats("3");
			n.setTicket_fare("50000");
			session.save(n);
			session.getTransaction().commit();
			session.close();
		}
	}

}
