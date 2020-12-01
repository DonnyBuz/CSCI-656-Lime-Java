package model.edu.cofc.cs656.models;

public class Admin extends User
{
	private static int index = 1000;
	private int personnelID;
	
	public Admin(String e, String pass, String n, String ss)
	{
		super(e,pass,n,ss);
		personnelID = index;
		index++;
		userType = "Admin";
	}
	
	public int GetPersonelID(){return personnelID;}
	public void SetPersonelID(int id){personnelID = id;}

}