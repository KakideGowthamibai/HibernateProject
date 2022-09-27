package com.main;


import java.time.LocalDate;

import javax.persistence.Entity;

import com.entity.HotelReservation;
import com.entity.Rooms;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateHotelRegistration 
{
	public static void main(String[]args)
	{
		  SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
         LocalDate Check_in=LocalDate.now() ;
         LocalDate Check_out=LocalDate.now() ;
         
         HotelReservation hr = new HotelReservation();
         hr.setName("Gowthami");
         hr.setAddress("Banglore");
         hr.setMobile_no((long) 99859476);
         hr.setCheck_in(Check_in);
         hr.setChech_out(Check_out);
         hr.setRoom_No(109);
         
         hr.setName("sreenu");
         hr.setAddress("Banglore");
         hr.setMobile_no((long) 76565449);
         hr.setCheck_in(Check_in);
         hr.setChech_out(Check_out);
         hr.setRoom_No(107);
         
         hr.setName("Anjali");
         hr.setAddress("Anantapur");
         hr.setMobile_no((long) 6566466);
         hr.setCheck_in(Check_in);
         hr.setChech_out(Check_out);
         hr.setRoom_No(108);
         
         hr.setName("Meghana");
         hr.setAddress("Maharastra");
         hr.setMobile_no((long) 9356569);
         hr.setCheck_in(Check_in);
         hr.setChech_out(Check_out);
         hr.setRoom_No(100);
         
         hr.setName("Sowmya");
         hr.setAddress("Maharastra");
         hr.setMobile_no((long) 93565786);
         hr.setCheck_in(Check_in);
         hr.setChech_out(Check_out);
         hr.setRoom_No(205);
         
         
         
         
         Rooms rooms=new Rooms();
         rooms.setRoom_No(109);
         rooms.setRoom_Type("Non-AC");
         rooms.setBed_Type("DoubleBed");
         rooms.setAmount(5000);
         
         rooms.setRoom_No(107);
         rooms.setRoom_Type("AC");
         rooms.setBed_Type("SingleBed");
         rooms.setAmount(2000);
         
         rooms.setRoom_No(108);
         rooms.setRoom_Type("Non-AC");
         rooms.setBed_Type("SingleBed");
         rooms.setAmount(2000);
         
         rooms.setRoom_No(90);
         rooms.setRoom_Type("AC");
         rooms.setBed_Type("DoubleBed");
         rooms.setAmount(2000);
         
         rooms.setRoom_No(205);
         rooms.setRoom_Type("AC");
         rooms.setBed_Type("DoubleBed");
         rooms.setAmount(2000);
         
         
         
         hr.setRooms(rooms);
         session.save(hr);

         session.save(rooms);
         
         
         
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

         }
}