package business.edu.cofc.cs656.services;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import model.edu.cofc.cs656.models.User;
import model.edu.cofc.cs656.models.Admin;
import model.edu.cofc.cs656.models.Juicer;
import model.edu.cofc.cs656.models.Renter;

public class UserServices
{
	private List<User> users;
	private List<Admin> admins;
	private List<Renter> renters;
	private List<Juicer> juicers;
	String status;
	
	public UserServices()
	{
		users = new ArrayList<User>();
		admins = new ArrayList<Admin>();
		renters = new ArrayList<Renter>();
		juicers = new ArrayList<Juicer>();
		status = "UserServices class created.";
	}

	public String RegisterAdmin(Admin admin)
	{
		if(EmailAvailable(admin.GetEmail()))
		{
			users.add(admin);
			admins.add(admin);
			return "Admin registered.";
		}
		else
		{
			return "Email already associated with account.";
		}
	}
	
	public String RegisterRenter(Renter renter)
	{
		if(EmailAvailable(renter.GetEmail()))
		{
			users.add(renter);
			renters.add(renter);
			return "Renter registered.";	
		}
		else
		{
			return "Email already associated with account.";
		}
	}	
	
	public String RegisterJuicer(Juicer juicer)
	{
		if(EmailAvailable(juicer.GetEmail()))
		{		
			users.add(juicer);
			juicers.add(juicer);
			return "Admin registered.";
		}
		else
		{
			return "Email already associated with account.";
		}
	}
	
	public Admin LoginAsAdmin(String email, String password)
	{
		ListIterator<Admin> iterator = null;
		iterator = admins.listIterator();
		while(iterator.hasNext())
		{
			Admin admin = iterator.next();
			if(admin.GetEmail() == email)
			{
				if(admin.GetPassword() == password)
				{
					status = "Admin Login Successful";
					return admin;
				}
				else
				{
					status = "Invalid Password";
					return null;
				}
			}
		}
		status = "Email or password invalid";
		return null;
	}

	public Renter LoginAsRenter(String email, String password)
	{
		ListIterator<Renter> iterator = null;
		iterator = renters.listIterator();
		while(iterator.hasNext())
		{
			Renter renter = iterator.next();
			if(renter.GetEmail() == email)
			{
				if(renter.GetPassword() == password)
				{
					status = "Renter Login Successful";
					return renter;
				}
				else
				{
					status = "Invalid Password";
					return null;
				}
			}
		}
		status = "Email or password invalid";
		return null;
	}
	
	public Juicer LoginAsJuicer(String email, String password)
	{
		ListIterator<Juicer> iterator = null;
		iterator = juicers.listIterator();
		while(iterator.hasNext())
		{
			Juicer juicer = iterator.next();
			if(juicer.GetEmail() == email)
			{
				if(juicer.GetPassword() == password)
				{
					status = "Juicer Login Successful";
					return juicer;
				}
				else
				{
					status = "Invalid Password";
					return null;
				}
			}
		}
		status = "Email or password invalid";
		return null;
	}
	
	public String UpdateAdminAccount(Admin admin) 
	{
		
		return "Updated: " + admin.toString();
	}
	
	public String UpdateRenterAccount(Renter renter) 
	{
		
		return "Updated: " + renter.toString();
	}
	
	public String UpdateJuicerAccount(Juicer juicer) 
	{
		
		return "Updated: " + juicer.toString();
	}
	
	private boolean EmailAvailable(String email)
	{
		ListIterator<User> iterator = null;
		iterator = users.listIterator();
		while(iterator.hasNext())
		{
			User user = iterator.next();
			if(user.GetEmail() == email)
			{
				return false;
			}
		}
		return true;		
	}
	
	public String toString()
	{
		return status;
	}
}
