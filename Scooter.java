
class Scooter
{
	private String serialNumber;
	private double batteryLevel;
	private String currentStatus;
	private boolean available;

	public String GetSerialNumber(){return serialNumber;}
	public void SetSerialNumber(String number){serialNumber = number;}	
	
	public double GetBatteryLevel(){return batteryLevel;}
	public void SetBatteryLevel(double level){batteryLevel = level;}

	public String GetCurrentStatus(){return currentStatus;}
	public void SetCurrentStatus(String status){currentStatus = status;}	
	
	public boolean IsAvailable(){return available;}
	public void SetAvailable(boolean avail){available = avail;}

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

	RenterReview()
	{
		
	}
	
	public String GetRenterID(){return renterID;}
	public void SetRenterID(String id){renterID = id;}	
	
	public String GetRentalID(){return rentalID;}
	public void SetRentalID(String id){rentalID = id;}

	public int GetRating(){return rating;}
	public void SetRating(int score){rating = score;}	
	
	public String GetComments(){return comments;}
	public void SetComments(String com){comments = com;}
}

class RentalPayment
{
	private double amount;
	private String status;

	RentalPayment()
	{
		
	}

	public double GetAmount(){return amount;}
	public void SetAmount(double a){amount = a;}	
	
	public String GetStatus(){return status;}
	public void SetStatus(String stat){status = stat;}
	
	public void ProcessPayment()
	{
		
	}
	
	public RentalRecord CreateRecord( String serialNumber ) 
	{
		RentalRecord record = new RentalRecord(amount, serialNumber, "Current Date");
		return record;		
	}
}

class RentalRecord
{
	private double amount;
	private String serialNumber;
	private String date;
	
	RentalRecord(double a, String sn, String d)
	{
		amount = a;
		serialNumber = sn;
		date = d;
	}
}

