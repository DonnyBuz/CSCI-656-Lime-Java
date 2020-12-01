package business.edu.cofc.cs656.services;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.lang.StringBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import org.json.*;

import model.edu.cofc.cs656.models.User;
import model.edu.cofc.cs656.models.Admin;
import model.edu.cofc.cs656.models.Juicer;
import model.edu.cofc.cs656.models.Renter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;



@Path("users")
public class UserServices
{
	private static List<User> users;
	private static List<Admin> admins;
	private static List<Renter> renters;
	private static List<Juicer> juicers;
	String status;
	String message;
	
	public UserServices()
	{
		// users = new ArrayList<User>();
		// admins = new ArrayList<Admin>();
		// renters = new ArrayList<Renter>();
		// juicers = new ArrayList<Juicer>();
		status = "UserServices class created.";
	}

	public static void Initialize()
	{
		users = new ArrayList<User>();
		admins = new ArrayList<Admin>();
		renters = new ArrayList<Renter>();
		juicers = new ArrayList<Juicer>();
	}

	public String RegisterAdmin(Admin admin)
	{
		if(EmailAvailable(admin.GetEmail()))
		{
			users.add(admin);
			admins.add(admin);
			status = "success";
			return "Admin registered.";
			
		}
		else
		{
			status = "failure";
			return "Email already associated with account.";
		}
	}
	
	public String RegisterRenter(Renter renter)
	{
		if(EmailAvailable(renter.GetEmail()))
		{
			users.add(renter);
			renters.add(renter);
			status = "success";
			return "Renter registered.";	
		}
		else
		{
			status = "failure";
			return "Email already associated with account.";
		}
	}	
	
	public String RegisterJuicer(Juicer juicer)
	{
		if(EmailAvailable(juicer.GetEmail()))
		{		
			users.add(juicer);
			juicers.add(juicer);
			status = "success";
			return "Juicer registered.";
		}
		else
		{
			status = "failure";
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
	
    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // public String getIt() {
        // return "This is a method inside users!!";
    // }
	private User GetUserFromID(int id)
	{
		ListIterator<User> iterator = null;
		iterator = users.listIterator();	
		while(iterator.hasNext())
		{
			User user = iterator.next();
			if(user.GetUserID() == id)
			{
				status = "success";
				message = "User record has been fetched.";
				return user;
			}
		}
		status = "failure";
		message = "User id does not exist.";
		return null;
	}	
	
	private void RemoveUserByID(int id)
	{
		ListIterator<User> iterator = null;
		iterator = users.listIterator();	
		while(iterator.hasNext())
		{
			User user = iterator.next();
			if(user.GetUserID() == id)
			{
				iterator.remove();
				status = "success";
				message = "User record has been deleted.";
				return;
			}
		}
		status = "failure";
		message = "User id does not exist.";
		return;
	}
	
    @GET
	@Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String GetAllUsers()
	{
		status = "success";
		if(users.isEmpty())
		{
			status = "failed";
			message = "No users exist.";
		}
		else
		{
			status = "success";
			message = "All users fetched.";			
		}
		return "{\"status\":\""+status+"\",\"data\":["+ users.stream()
        .map(c -> c.toString())
		.collect(Collectors.joining(",")) + "],\"message\":\""+message+"\"}";
    }
	
	
	@GET
	@Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String GetUser(@PathParam("id") int id)
	{
		User user = GetUserFromID(id);
		if(user == null)
		{
			return "{\"status\":\""+status+"\",\"data\":null,\"message\":\""+message+"\"}";
		}
		else
		{
			return "{\"status\":\""+status+"\",\"data\":["+user.toString()+"],\"message\":\""+message+"\"}";
		}
	}

	@POST
	@Path("/createadmin")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String CreateAdmin(String newUser)
	{	
		JSONObject obj = new JSONObject(newUser);
		Admin admin = new Admin(obj.getString("email"),obj.getString("password"),obj.getString("name"),obj.getString("ssn"));
		message = RegisterAdmin(admin);
		return "{\"status\":\""+status+"\",\"data\":{"+ newUser + "},\"message\":\""+message+"\"}";
	}
	
	@POST
	@Path("/createrenter")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String CreateRenter(String newUser)
	{	
		JSONObject obj = new JSONObject(newUser);
		Renter renter = new Renter(obj.getString("email"),obj.getString("password"),obj.getString("name"),obj.getString("ssn"));
		message = RegisterRenter(renter);
		return "{\"status\":\""+status+"\",\"data\":{"+ newUser + "},\"message\":\""+message+"\"}";
	}
	
	@POST
	@Path("/createjuicer")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String CreateJuicer(String newUser)
	{	
		JSONObject obj = new JSONObject(newUser);
		Juicer juicer = new Juicer(obj.getString("email"),obj.getString("password"),obj.getString("name"),obj.getString("ssn"));
		message = RegisterJuicer(juicer);
		return "{\"status\":\""+status+"\",\"data\":{"+ newUser + "},\"message\":\""+message+"\"}";
	}

	@PUT
	@Path("/updateuser/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public String UpdateRenter(@PathParam("id") int id, String userUpdate)
	{	
		JSONObject obj = new JSONObject(userUpdate);
		User user = GetUserFromID(id);
		user.SetEmail(obj.getString("email"));
		user.SetPassword(obj.getString("password"));
		user.SetName(obj.getString("name"));
		user.SetBirthday(obj.getString("birthday"));
		user.SetAddress(obj.getString("address"));
		user.SetSSN(obj.getString("ssn"));
		return "{\"status\":\""+status+"\",\"data\":{"+ user.toString() + "},\"message\":\""+message+"\"}";
	}

	@DELETE
	@Path("/deleteuser/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public String RemoveUser(@PathParam("id") int id)
	{	
		RemoveUserByID(id);
		return "{\"status\":\""+status+"\",\"message\":\""+message+"\"}";
	}
	
	
	
}
