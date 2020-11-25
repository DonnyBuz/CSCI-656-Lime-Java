package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.models.PaymentMethod;

public class PaymentServices
{
	String status;
	
	public PaymentServices()
	{
		status = "Payement services class created.";
	}
	
	public String ProcessPayment(PaymentMethod method, double amount)
	{
		status = "PaymentProcessed";
		return "Payment Method: " + method.GetName() + " for: $" + String.valueOf(amount);
	}
	
	public String toString()
	{
		return status;
	}
}
