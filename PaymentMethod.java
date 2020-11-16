
class PaymentMethod
{
	private String name;
	private String type;
	private String bankName;
	private String paymentAddress;
}

class BankAccount extends PaymentMethod
{
	private String acountNumber;
	private String routingNumber;
	
	public void VerifyAccount()
	{	
		
	}
}

class CreditCard extends PaymentMethod
{
	private String cardNumber;
	private String expiration;
	private String CCV;
}

class Subscription
{
	private String subscriptionType;
	private double subscriptionCost;
	
	public void AssignPaymentMethod( PaymentMethod p )
	{	
		
	}
	
	public void ProcessPayment()
	{	
		
	}	
}