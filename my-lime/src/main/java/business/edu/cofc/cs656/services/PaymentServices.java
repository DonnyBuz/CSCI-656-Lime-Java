package business.edu.cofc.cs656.services;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

import model.edu.cofc.cs656.models.PaymentMethod;
import model.edu.cofc.cs656.models.CreditCard;
import model.edu.cofc.cs656.models.BankAccount;
import model.edu.cofc.cs656.models.Subscription;

public class PaymentServices
{
	private List<Subscription> subscriptions;
	private List<PaymentMethod> paymentMethods;
	private List<CreditCard> creditCards;
	private List<BankAccount> bankAccounts;
	String status;
	
	public PaymentServices()
	{
		subscriptions   = new ArrayList<Subscription>   ();
		paymentMethods = new ArrayList<PaymentMethod>  ();
		creditCards     = new ArrayList<CreditCard>     ();
		bankAccounts 	= new ArrayList<BankAccount>    ();
		status = "Payement services class created.";
	}
	
	public String AddPaymentMethod(CreditCard cc)
	{
		paymentMethods.add(cc);
		creditCards.add(cc);
		return "Credit card added.";
	}
	
	public String AddPaymentMethod(BankAccount account)
	{
		paymentMethods.add(account);
		bankAccounts.add(account);
		return "Bank account added.";
	}

	public String AddSubscription(Subscription subscription)
	{
		subscriptions.add(subscription);
		return "Subscription added.";
	}	
	
	public List<PaymentMethod> GetPaymentMethods()
	{
		return paymentMethods;
	}
	
	public List<PaymentMethod> GetPaymentMethodsForUserID(int userID)
	{
		List<PaymentMethod> methods = new ArrayList<PaymentMethod>();
		ListIterator<PaymentMethod> iterator = null;
		iterator = paymentMethods.listIterator();
		while(iterator.hasNext())
		{
			PaymentMethod paymentMethod = iterator.next();
			if(paymentMethod.GetUserID() == userID)
			{
				status = "paymentMethod found.";
				methods.add(paymentMethod);
			}
		}
		if(methods.isEmpty())
		{
			status = "Failed. No methods found.";
			return null;
		}
		else
		{
			status = "Success.";
			return methods;
		}
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
