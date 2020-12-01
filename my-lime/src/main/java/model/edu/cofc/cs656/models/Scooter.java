package model.edu.cofc.cs656.models;

public class Scooter
{
	private static int index = 1000;
	private int scooterID;
	private int renterID;
	private double batteryLevel;
	private String currentStatus;
	private boolean available;
	private String region;
	
	public Scooter(String scooterRegion)
	{
		region = scooterRegion;
		scooterID = index;
		renterID = 0;
		index++;
		batteryLevel = 100;
		currentStatus = "Available";
		available = true;
	}

	public int GetSooterID(){return scooterID;}
	public void SetScooterID(int number){scooterID = number;}	

	public int GetRenterID(){return renterID;}
	public void SetRenterID(int number){renterID = number;}		
	
	public double GetBatteryLevel(){return batteryLevel;}
	public void SetBatteryLevel(double level){batteryLevel = level;}

	public String GetCurrentStatus(){return currentStatus;}
	public void SetCurrentStatus(String status){currentStatus = status;}	
	
	public boolean IsAvailable(){return available;}
	public void SetAvailable(boolean avail){available = avail;}

	public String GetRegion(){return region;}
	public void SetRegion(String scooterRegion){region = scooterRegion;}	
	
	public String toString()
	{	
		return "[scooterID = "+String.valueOf(scooterID)+", batterLevel = "+String.valueOf(batteryLevel)+", currentstatus = "+currentStatus+", available = "+String.valueOf(available)+"]";
	}
}