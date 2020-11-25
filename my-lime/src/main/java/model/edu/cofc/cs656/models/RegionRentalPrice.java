package model.edu.cofc.cs656.models;

public class RegionRentalPrice 
{
	private double amount;
	private String regionName;
	
	public RegionRentalPrice(String region, double amt)
	{
		amount = amt;
		regionName = region;
	}
	
	public String GetRegionName(){return regionName;}
	public void SetRegionName(String name){regionName = name;}	

	public double GetPrice(){return amount;}
	public void SetPrice(double amt){amount = amt;}
	
	public String toString()
	{
		return "[regionName = " + regionName + "; amount = " + amount + "]";
	}
}