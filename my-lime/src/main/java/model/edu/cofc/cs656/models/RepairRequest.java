package model.edu.cofc.cs656.models;

public class RepairRequest
{
	private static int index = 1000;
	private int requestID; 
	private int scooterID;
	private String issueDescription;

	public RepairRequest(int scooterid, String description)
	{
		requestID = index;
		index++;
		scooterID = scooterid;
		issueDescription = description;
	}

	public int GetRequestID(){return requestID;}
	public void SetRequestID(int id){requestID = id;}
	
	public int GetScooterID(){return scooterID;}
	public void SetScooterID(int id){scooterID = id;}
	
	public String GetIssueDescription(){return issueDescription;}
	public void SetIssueDescription(String description){issueDescription = description;}	
	
	public String toString()
	{
		return "[requestID = " + String.valueOf(requestID) + ", scooterId = " + String.valueOf(scooterID) + ", description = " + issueDescription + "]";
	}
}