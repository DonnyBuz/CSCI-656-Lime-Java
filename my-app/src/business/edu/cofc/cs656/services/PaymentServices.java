package edu.cofc.cs656.services;

import edu.cofc.cs656.models.PaymentMethod;

public class PaymentServices
{
	String status;
	
	public PaymentServices()
	{
		
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
