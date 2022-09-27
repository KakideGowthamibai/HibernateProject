package com.main;


	import java.util.List;

	import com.entity.HotelReservation;
	import com.utility.hibernateUtility;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.query.Query;

	public class ViewDetails {

		public static void main(String[] args) 
		{
			SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
			  Session session = sessionFactory.openSession();
			  session.beginTransaction();
			  
			  Query<HotelReservation> query1=session.createQuery("from HotelReservation");
		         
		        List<HotelReservation> result=query1.list();
		         
		         
		       for(HotelReservation hr:result)
		      {
		       	System.out.println(hr.getName()); 
		       	System.out.println(hr.getCheck_in());
		       	System.out.println(hr.getRoom_No());

		         }

			  
			  
			  session.getTransaction().commit();
			  session.close();
			  sessionFactory.close();

		}

	}

