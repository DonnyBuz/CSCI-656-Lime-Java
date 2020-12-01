package business.edu.cofc.cs656.services;

import java.util.List;
import java.util.ArrayList;

import model.edu.cofc.cs656.models.RegionRentalPrice;

public class RentalPricingServices 
{
	private List<RegionRentalPrice> prices;
	String status;
	
	public RentalPricingServices()
	{
		prices = new ArrayList<RegionRentalPrice>();
		prices.add(new RegionRentalPrice("Default",0.0));
		status = "RentalPricingServices class created..";
	}
	
	public String AddRegionRentalPrice(String regionName, double price)
	{
		RegionRentalPrice r = new RegionRentalPrice(regionName, price);
		if(prices.contains(r))
		{
			return "Region already exists.";
		}
		else
		{
			prices.add(r);
			return "Region price added.";
		}
	}
	
	public String AdjustAll ( double percentChange )
	{
		prices.forEach((n) -> n.SetPrice(n.GetPrice()*percentChange/100));
		return "Prices adjusted by " + String.valueOf(percentChange) + "% .";
	}
	
	public String SetRegionPrice( String region, double amount ) 
	{
		prices.forEach( (temp) ->
		{
			if(temp.GetRegionName().equals(region))
			{
				temp.SetPrice(amount);
			}
		});
		return "Price set to $" + String.valueOf(amount) + " .";
	}
	
	public RegionRentalPrice GetRegionRentalPrice( String regionName )
	{
		for(int i=0; i<prices.size(); i++)
		{
			if(prices.get(i).GetRegionName().equals(regionName))
			{
				return prices.get(i);
			}
		}
		return prices.get(0);
	}
	

	public String AdjustRegionPriceByPercent( String region, double percentChange ) 
	{
		prices.forEach( (temp) ->
		{
			if(temp.GetRegionName().equals(region))
			{
				temp.SetPrice(temp.GetPrice()*percentChange/100);
			}
		});
		return region + "price adjusted by " + String.valueOf(percentChange) + "% .";
	}
	
	public String toString()
	{
		return status;
	}
	
}	