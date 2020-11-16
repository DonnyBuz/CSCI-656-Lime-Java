import java.util.ArrayList;

class RentalPricingAdjustor
{
	private int numberRegions;
	private ArrayList<RegionRentalPrice> prices;
	
	RentalPricingAdjustor()
	{
		numberRegions = 1;
		prices.add(new RegionRentalPrice("Default",0.0));
	}
	
	public void AddRegionRentalPrice(String regionName, double price)
	{
		numberRegions = numberRegions + 1;
		prices.add(new RegionRentalPrice(regionName,price));
	}
	
	public void AdjustAll ( double percentChange )
	{
		prices.forEach((n) -> n.SetPrice(n.GetPrice()*percentChange));
	}
	
	public void SetRegionPrice ( String region, double amount ) 
	{
		for(int i=0; i<numberRegions; i++)
		{
			if(prices.get(i).GetRegionName().equals(region))
			{
				prices.get(i).SetPrice(amount);
			}
		}
	}
	
	public RegionRentalPrice GetRegionRentalPrice( String regionName )
	{
		for(int i=0; i<numberRegions; i++)
		{
			if(prices.get(i).GetRegionName().equals(regionName))
			{
				return prices.get(i);
			}
		}
		return prices.get(0);
	}
}	


class RegionRentalPrice
{
	private double amount;
	private String regionName;
	
	RegionRentalPrice(String region, double amt)
	{
		amount = amt;
		regionName = region;
	}
	
	public String GetRegionName(){return regionName;}
	public void SetRegionName(String name){regionName = name;}	

	public double GetPrice(){return amount;}
	public void SetPrice(double amt){amount = amt;}
	
	public void AdjustPriceByPercent ( double percentChange )
	{
		amount = amount*percentChange;
	}
}

