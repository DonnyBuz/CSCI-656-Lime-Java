package edu.cofc.cs656.services;

import java.util.List;
import java.util.ArrayList;

import edu.cofc.cs656.models.Renter;
import edu.cofc.cs656.models.Juicer;
import edu.cofc.cs656.models.Admin;

public class AccountServices
{
	private List<Renter> renterAccounts;
	private List<Juicer> juicerAccounts;
	private List<Admin>	adminAccounts;
	
	public AccountServices()
	{
		renterAccount = new List<Renter>();
		juicerAccounts = new List<Juicer>();
		adminAccounts = new List<Admin>();	
	}
	
	public String RegisterRenterAccount(String email, String password)
	{
		renterAccounts.add(new Renter());
		return "Account created;
	}
	
	public String RegisterJuicerAccount(String email, String password)
	{
		
	}
	
	public String RegisterAdminAccount(String email, String password)
	{
		
	}
	
	public Renter RenterLogin(String email, String password)
	{
		
	}
	
	public Juicer JuicerLogin(String email, String password)
	{
		
	}
	
	public Admin AdminLogin(String email, String password)
	{
		
	}
	
	public void RegisterAdmin()
	{
		
	}
	
	public void UpdateAccount() 
	{
		
	}
	
	public void ViewRenterReviews() 
	{
		
	}
	
	public void ViewBusinessAccount() 
	{
		
	}
	
}
