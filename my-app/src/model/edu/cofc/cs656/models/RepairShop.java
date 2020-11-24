package edu.cofc.cs656.models;

public class RepairShop
{
	String name;
	String email;
	String address;

	public RepairShop(String shopName, String shopEmail, String shopAddress)
	{
		name = shopName;
		email = shopEmail;
		address = shopAddress;
	}

	public String GetName(){return name;}
	public void SetName(String n){name = n;}
	
	public String GetEmail(){return email;}
	public void SetEmail(String e){email = e;}
	
	public String GetAddress(){return address;}
	public void SetAddress(String shopAddress){address = shopAddress;}	
	
	public String toString()
	{
		return "[name = " + name + "; email = " + email + "; address = " + address + "]";
	}
}