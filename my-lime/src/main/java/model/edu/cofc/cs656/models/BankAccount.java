package model.edu.cofc.cs656.models;

public class BankAccount extends PaymentMethod
{
	private String accountNumber;
	private String routingNumber;

	public BankAccount(String name, String bank, String address, String accountNum, String routingNum)
	{
		super(name,bank,address);
		accountType = "Bank Account";
		accountNumber = accountNum;
		routingNumber = routingNum;
	}

	public String GetAccountNumber(){return accountNumber;}
	public void SetAccountNumber(String number){accountNumber = number;}
	
	public String GetRoutingNumber(){return routingNumber;}
	public void SetRoutingNumber(String number){routingNumber = number;}
	
	public String toString()
	{
		return "{\"id\"=\""+String.valueOf(id)+",\"methodName\"=\""+methodName+"\",\"accountType\"=\""+accountType+"\",\"bankName\"=\""+bankName+"\",\"paymentAddress\"=\""+paymentAddress+"\",\"userID\"=\""+String.valueOf(userID)+"\",\"accountNumber\"=\""+accountNumber+"\",\"routingNumber\"=\""+routingNumber+"\"}";
	}
}
