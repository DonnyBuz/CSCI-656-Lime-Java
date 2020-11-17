
interface PaymentMethod
{
	public String GetName();
	public void SetName(String name);	
	
	public String GetAccountType();
	public void SetAccountType(String type);
	
	public String GetBankName();
	public void SetBankName(String name);
	
	public String GetPaymentAddress();
	public void SetPaymentAddress(String address);
}

class Impl_PaymentMethod
{
	private String methodName;
	private String accountType;
	private String bankName;
	private String paymentAddress;
	
	Impl_PaymentMethod(String name, String type, String bank, String address)
	{
		methodName = name;
		accountType = type;
		bankName = bank;
		paymentAddress = address;
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

class BankAccount extends Impl_PaymentMethod
{
	private String accountNumber;
	private String routingNumber;

	BankAccount(String name, String type, String bank, String address, String accountNum, String routingNum)
	{
		super(name,type,bank,address);
		accountNumber = accountNum;
		routingNumber = routingNum;
	}

	public String GetAccountNumber(){return accountNumber;}
	public void SetAccountNumber(String number){accountNumber = number;}
	
	public String GetRoutingNumber(){return routingNumber;}
	public void SetRoutingNumber(String number){routingNumber = number;}
	
	public void VerifyAccount()
	{	
		
	}
}

class CreditCard extends Impl_PaymentMethod
{
	private String cardNumber;
	private String expiration;
	private String CCV;

	CreditCard(String name, String type, String bank, String address, String cardNum, String exp, String ccvCode)
	{
		super(name,type,bank,address);
		cardNumber = cardNum;
		expiration = exp;
		CCV = ccvCode;		
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