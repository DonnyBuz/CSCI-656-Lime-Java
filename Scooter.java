
class Scooter
{
	private String serialNumber;
	private double batteryLevel;
	private String currentStatus;
	private boolean available;

	public void PayForRental(PaymentMethod method)
	{
		
	}
	
	public void CompleteRental() 
	{
		
	}
	
	public void GenerateTask()
	{
		
	}
	
	public void AddReview(RenterReview review) 
	{
		
	}
}

class RenterReview
{
	private String renterID;
	private String rentalID;
	private int rating;
	private String comments;
}

class RentalPayment
{
	private double amount;
	private String status;
	
	public void ProcessPayment()
	{
		
	}
	
	public RentalRecord CreateRecord( String serialNumber ) 
	{
		RentalRecord record = new RentalRecord();
		return record;		
	}
}

class RentalRecord
{
	private double amount;
	private String serialNumber;
	private String date;
}

