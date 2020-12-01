package business.edu.cofc.cs656.services;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

import model.edu.cofc.cs656.models.Scooter;
import model.edu.cofc.cs656.models.Juicer;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.RenterReview;

public class ScooterServices
{
	private TaskServices taskServices;
	private RentalPricingServices pricingServices;
	private List<Scooter> scooters;
	private List<RenterReview> reviews;
	private String status;
	
	public ScooterServices(TaskServices ts, RentalPricingServices rps)
	{
		scooters = new ArrayList<Scooter>();
		reviews = new ArrayList<RenterReview>();
		taskServices = ts;
		pricingServices = rps;
		status = "ScooterServices class created.";
	}
	
	public String AddScooter(Scooter scooter)
	{
		scooters.add(scooter);
		return "Scooter added.";
	}
	
	public List<Scooter> ViewScooters()
	{
		return scooters;
	}	

	public String RentScooter(int renterID, int scooterID, int paymentID) 
	{
		Scooter scooter = GetScooterByID(scooterID);
		if(scooter.IsAvailable())
		{
			scooter.SetAvailable(false);
			scooter.SetCurrentStatus("Reserved");
			scooter.SetRenterID(renterID);
			return "Scooter reserved.";
		}
		else
		{
			return "Scooter unavailable.";
		}
	}
	
//	public void PayForRental(PaymentMethod method)
	{
		
	}
	
	public String CompleteRental(int scooterID)
	{
		Scooter scooter = GetScooterByID(scooterID);
		if(scooter.GetBatteryLevel()<25)
		{
			scooter.SetAvailable(false);
			scooter.SetCurrentStatus("Low Battery");		
			taskServices.CreateTask(scooter);
		}
		else
		{
			scooter.SetAvailable(true);
			scooter.SetCurrentStatus("Available");
		}
		return "Rental complete.";
		
	}

	public void AddReview(RenterReview review)
	{
		reviews.add(review);
	}
	
	public List<RenterReview> ViewReviews()
	{
		return reviews;
	}		
	
	public String toString()
	{
		return status;
	}
	
	public Scooter GetScooterByID(int id)
	{
		ListIterator<Scooter> iterator = null;
		iterator = scooters.listIterator();
		while(iterator.hasNext())
		{
			Scooter scooter = iterator.next();
			if(scooter.GetSooterID() == id)
			{
				status = "ScooterID found.";
				return scooter;
			}
		}
		status = "ScooterID not found.";
		return null;
	}
	
}
