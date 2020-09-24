package services;

import java.time.LocalDate;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code
public class FareCalculator extends Booking
{
	public double booking(int noOfPersons,int rate)
	{
		return (noOfPersons*rate);
	}
	public double book(Hotel hotel)
	{
		int persons=hotel.getNoOfPersons();
		LocalDate d1=hotel.getFromdate();
		LocalDate d2=hotel.getTodate();
		String occupancy=hotel.getOccupancy();
		double fare=0;
		int rate=hotel.getRates();
		if(d1.isBefore(d2))
		{
		   if(occupancy=="Single")
		   {
			   fare=persons*rate;
		   }
		   else
		   {
			   fare=((1*rate)+(2*rate));
			   
		   }
		}
		return fare;
	}
	public double book(Flight flight)
    {
		String  type=flight.getTriptype();
		int num=flight.getNoOfPersons();
		int rates=flight.getRate();
		double fare;
		LocalDate d1=flight.getFrom();
		LocalDate d2=flight.getTo();
		int date=d1.getDayOfMonth();
		int date2=d2.getDayOfMonth();
	     if(type=="Round trip" && (date<date2))
		{
			fare=num*rates;
		}
	     else
	     {
	    	 return(num*rates);
	     }
	    	 
	     return fare;
		
	}
	public double book(Train train)
	{
		int num=train.getNoOfPersons();
		int rate=train.getRate();
		double fare=num*rate;
		return fare;
	}
	public double book(Bus bus)
	{
		int num=bus.getNoOfPersons();
		int rate=bus.getRate();
		double fare=num*rate;
		return fare;
	
		
	}
}