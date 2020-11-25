package model.edu.cofc.cs656.models;

public class Task 
{
	private static int index = 1000;
	private int taskID;
	private int scooterID;
	private int juicerID;
	private String description;
	private double value;
	private boolean reservedStatus;
	private String status;
	
	public Task(int scooterid, String taskDescription, double taskValue)
	{
		taskID = index;
		index++;
		scooterID = scooterid;
		description = taskDescription;
		value = taskValue;
		reservedStatus = false;
		status = "Created";
		juicerID = 0;
	}
	
	public int GetTaskID(){return taskID;}
	public void SetTaskID(int id){taskID = id;}	

	public int GetScooterID(){return scooterID;}
	public void SetScooterID(int id){scooterID = id;}	

	public int GetJuicerID(){return juicerID;}
	public void SetJuicerID(int id){juicerID = id;}	

	public String GetDescription(){return description;}
	public void SetDescription(String descr){description = descr;}	
	
	public double GetValue(){return value;}
	public void SetValue(double val){value = val;}	
	
	public boolean GetReservedStatus(){return reservedStatus;}
	public void SetReservedStatus(boolean reserved){reservedStatus = reserved;}	
	
	public String GetStatus(){return status;}
	public void SetStatus(String stat){status = stat;}
	
	public String toString()
	{
		return "[taskID = " + String.valueOf(taskID) + "; scooterID = " + String.valueOf(scooterID) + "; juicerId = " + String.valueOf(juicerID) + "; description = " + description + "; value = " + String.valueOf(value) + "; reserved = " + String.valueOf(reservedStatus) + "; status = " + status + "]";
	}
}