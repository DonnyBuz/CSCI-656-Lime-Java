package business.edu.cofc.cs656.services;

import java.util.List;
import java.util.ArrayList;

import model.edu.cofc.cs656.models.RepairRequest;
import model.edu.cofc.cs656.models.RepairShop;

public class RepairServices
{
	private List<RepairRequest> requests;
	private List<RepairShop> shops;
	private String status;

	public RepairServices()
	{
		shops = new ArrayList<RepairShop>();
		requests = new ArrayList<RepairRequest>();
		status = "RepairServices class created.";
	}
	
	public String AddRepairRequest(int id, String description)
	{
		requests.add( new RepairRequest(id, description) );
		return "Repair request added. ID " + String.valueOf(id);
	}
	
	public String AddRepairShop(String name, String email, String address)
	{
		shops.add( new RepairShop(name,email,address) );
		return name + "repair shop added.";
	}
	
	public List<RepairRequest> ViewRepairRequests()
	{
		return requests;
	}
	
	public List<RepairShop> ViewRepairShops() 
	{
		return shops;	
	}
	
	public void EmailShop(RepairShop rs, RepairRequest rr)
	{
		status = "Email sent to: " + rs.toString() + " for: " + rr.toString();
	}
	
	public String toString()
	{
		return status;
	}
}