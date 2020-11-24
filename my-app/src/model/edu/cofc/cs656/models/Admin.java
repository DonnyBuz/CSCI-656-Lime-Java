package edu.cofc.cs656.models;

public class Admin
{
	private String email;
	private String password;
	private String name;
	private String personnelID;
	
	Admin()
	{
		
	}
	
	public String GetEmail(){return email;}
	public void SetEmail(String e){email = e;}

	public String GetPassword(){return password;}
	public void SetPassword(String pass){password = pass;}
	
	public String GetName(){return name;}
	public void SetName(String n){name = n;}
	
	public String GetPersonelID(){return personnelID;}
	public void SetPersonelID(String id){personnelID = id;}


}