package business.edu.cofc.cs656.services;

public class RenterServices
{
	
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
	
	//public Scooter[] ViewAvailableScooters() 
	{
		//Scooter[] s = new Scooter[2];
		//return s;	
	}
	
	//public void ReserveScooter(Scooter s) 
	{

	}
	
	//public RentalRecord[] ViewHistory() 
	{
		//RentalRecord[] r = new RentalRecord[2];
		//return r;		
	}
	
	public void ViewPaymentMethods() 
	{
		//if(paymentMethods == null)
		{
			System.out.println("No payment Methods.");
		}
		//else
		{
			System.out.println("Yes payment Methods.");
		}
	}
	
	public void AddPaymentMethod(String name, String accountType, String bankName, String address) 
	{
		if(accountType.equals("CreditCard"))
		{
	//		paymentMethods.add(new CreditCard(name,accountType,bankName,address,"","",""));
	//		System.out.println(paymentMethods.get(0).GetName() + " payment method added.");
		}
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
