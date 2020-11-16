
class Renter
{
	private String email;
	private String password;
	private String name;
	private String birthday;
	private String homeAddress;
	private String ssn;

	Renter()
	{
		
	}
	
	public String GetEmail(){return email;}
	public void SetEmail(String e){email = e;}

	public String GetPassword(){return password;}
	public void SetPassword(String pass){password = pass;}
	
	public String GetName(){return name;}
	public void SetName(String n){name = n;}
	
	public String GetBirthday(){return birthday;}
	public void SetBirthday(String bday){birthday = bday;}
	
	public String GetAddress(){return homeAddress;}
	public void SetAddress(String address){homeAddress = address;}
	
	public String GetSSN(){return ssn;}
	public void SetSSN(String ss){ssn = ss;}

	public void RegisterRenter() 
	{
		
	}
	
	public void Login()
	{
			
	}
	
	public void Logout() 
	{
			
	}		
	
	public void UpdateAccount() 
	{
			
	}
	
	public Scooter[] ViewAvailableScooters() 
	{
		Scooter[] s = new Scooter[2];
		return s;	
	}
	
	public void ReserveScooter(Scooter s) 
	{
		
	}
	
	public RentalRecord[] ViewHistory() 
	{
		RentalRecord[] r = new RentalRecord[2];
		return r;		
	}
	
	public void ViewPaymentMethods() 
	{
		
	}
	
	public void AddPaymentMethod() 
	{
		
	}
	
	public void RemovePaymentMethod() 
	{
		
	}
	
	public void ViewActiveSubscription() 
	{
		
	}
	
	public void AddSubscription() 
	{
		
	}
	
	public void CancelSubscription() 
	{
		
	}
}

