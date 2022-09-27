package com.main;


import com.entity.HotelReservation;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteDetails {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		HotelReservation hr = (HotelReservation)session.load(HotelReservation.class,200);
		session.delete(hr);
		
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

	}

}