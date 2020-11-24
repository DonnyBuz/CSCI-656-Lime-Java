package edu.cofc.cs656.services;

import java.util.List;
import java.util.ArrayList;

import edu.cofc.cs656.models.RepairRequest;
import edu.cofc.cs656.models.RepairShop;

public class RepairServices
{
	private List<RepairRequest> requests;
	private List<RepairShop> shops;
	private String status;

	public RepairServices()
	{
		shops = new ArrayList<RepairShop>();
		requests = new ArrayList<RepairRequest>();
		status = "Repair services class created.";
	}
	
	public void AddRepairRequest(int id, int code, String description)
	{
		requests.add( new RepairRequest(id, code, description) );
		status = "Request added.";
	}
	
	public void AddRepairShop(String name, String email, String address)
	{
		shops.add( new RepairShop(name,email,address) );
		status = "Shop added.";
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