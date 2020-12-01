package model.edu.cofc.cs656.models;

//import java.util.List;

public class Renter extends User
{
	//private List<PaymentMethod> paymentMethods;
	public Renter(String e, String pass, String n, String ss)
	{
		super(e,pass,n,ss);
		userType = "Renter";
	}

}