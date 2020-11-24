package edu.cofc.cs656.models;

public class Task 
{
	
	private String title;
	private String description;
	private double value;
	private boolean reservedStatus;
	private String status;
	private int juicerId;

	public Task(String taskTitle, String taskDescription, double taskValue)
	{
		title = taskTitle;
		description = taskDescription;
		value = taskValue;
		reservedStatus = false;
		status = "Created";
		juicerId = 0;
	}
	
	public double GetValue(){return value;}
	public void SetValue(double val){value = val;}	
	
	public String GetTitle(){return title;}
	public void SetTitle(String name){title = name;}
	
	public String GetDescription(){return description;}
	public void SetDescription(String descr){description = descr;}

	public boolean GetReservedStatus(){return reservedStatus;}
	public void SetReservedStatus(boolean reserved){reservedStatus = reserved;}	
	
	public String GetStatus(){return status;}
	public void SetStatus(String stat){status = stat;}
	
	public String toString()
	{
		return "[title = " + title + "; description = " + description + "; value = " + String.valueOf(value) + "; reserved = " + String.valueOf(reservedStatus) + "; status = " + status + "; juicerId = " + String.valueOf(juicerId) +"]";
	}
}