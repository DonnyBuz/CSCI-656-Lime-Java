
class PaymentMethod
{
	private String methodName;
	private String accountType;
	private String bankName;
	private String paymentAddress;
	
	PaymentMethod()
	{
		
	}
	
	public String GetName(){return methodName;}
	public void SetName(String name){methodName = name;}	
	
	public String GetAccountType(){return accountType;}
	public void SetAccountType(String type){accountType = type;}
	
	public String GetBankName(){return bankName;}
	public void SetBankName(String name){bankName = name;}
	
	public String GetPaymentAddress(){return paymentAddress;}
	public void SetPaymentAddress(String address){paymentAddress = address;}
}

class BankAccount extends PaymentMethod
{
	private String accountNumber;
	private String routingNumber;

	BankAccount()
	{
		
	}

	public String GetAccountNumber(){return accountNumber;}
	public void SetAccountNumber(String number){accountNumber = number;}
	
	public String GetRoutingNumber(){return routingNumber;}
	public void SetRoutingNumber(String number){routingNumber = number;}
	
	public void VerifyAccount()
	{	
		
	}
}

class CreditCard extends PaymentMethod
{
	private String cardNumber;
	private String expiration;
	private String CCV;

	CreditCard()
	{
		
	}
	
	public String GetCardNumber(){return cardNumber;}
	public void SetCardNumber(String number){cardNumber = number;}
	
	public String GetExpiration(){return expiration;}
	public void SetExpiration(String exp){expiration = exp;}
	
	public String GetCCV(){return CCV;}
	public void SetCCV(String ccv){CCV = ccv;}
	

	
	
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