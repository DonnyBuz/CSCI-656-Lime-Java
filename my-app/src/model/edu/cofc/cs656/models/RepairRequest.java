package edu.cofc.cs656.models;

public class RepairRequest
{
	String issueDescription;
	int serviceCode;
	int scooterID;
	
	public RepairRequest(int id, int code, String description)
	{
		scooterID = id;
		serviceCode = code;
		issueDescription = description;
	}

	public String GetIssueDescription(){return issueDescription;}
	public void SetIssueDescription(String description){issueDescription = description;}	
	
	public int GetServiceCode(){return serviceCode;}
	public void SetServiceCode(int code){serviceCode = code;}
	
	public int GetScooterID(){return scooterID;}
	public void SetScooterID(int id){scooterID = id;}
	
	public String toString()
	{
		return "[scooterId = " + scooterID + "; service code = " + serviceCode + "; description = " + issueDescription + "]";
	}
}