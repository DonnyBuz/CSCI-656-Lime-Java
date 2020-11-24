package edu.cofc.cs656.models;

//import java.util.List;

public class Renter
{
	private static int index = 1000;
	private int renterID;
	private String email;
	private String password;
	private String name;
	private String birthday;
	private String homeAddress;
	private String ssn;
	//private List<PaymentMethod> paymentMethods;
	

	public Renter(String e, String pass, String n, String ss)
	{
		renterID = index;
		email = e;
		password = pass;
		name = n;
		ssn = ss;
		//paymentMethods = new List<PaymentMethod>();
		index++;
	}
	
	public String GetEmail(){return email;}
	public void SetEmail(String e){email = e;}

	public String GetPassword(){return password;}
	public void SetPassword(String pass){password = pass;}
	
	public String GetName(){return name;}
	public void SetName(String n){name = n;}
	
	public String GetBirthday(){return birthday;}
	public void SetBirthday(String bday){birthday = bday;}
	
	public String GetAddress(){return homeAddress;}
	public void SetAddress(String address){homeAddress = address;}
	
	public String GetSSN(){return ssn;}
	public void SetSSN(String ss){ssn = ss;}


}