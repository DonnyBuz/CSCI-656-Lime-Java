package edu.cofc.cs656.models;

public class Scooter
{
	private String serialNumber;
	private double batteryLevel;
	private String currentStatus;
	private boolean available;

	public String GetSerialNumber(){return serialNumber;}
	public void SetSerialNumber(String number){serialNumber = number;}	
	
	public double GetBatteryLevel(){return batteryLevel;}
	public void SetBatteryLevel(double level){batteryLevel = level;}

	public String GetCurrentStatus(){return currentStatus;}
	public void SetCurrentStatus(String status){currentStatus = status;}	
	
	public boolean IsAvailable(){return available;}
	public void SetAvailable(boolean avail){available = avail;}

//	public void PayForRental(PaymentMethod method)
	{
		
	}
	
	public void CompleteRental() 
	{
		
	}
	
	public void GenerateTask()
	{
		
	}
	
//	public void AddReview(RenterReview review) 
	{
		
	}
}