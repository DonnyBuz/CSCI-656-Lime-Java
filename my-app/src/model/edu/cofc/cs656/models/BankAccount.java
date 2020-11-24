package edu.cofc.cs656.models;


class BankAccount extends PaymentMethod
{
	private String accountNumber;
	private String routingNumber;

	BankAccount(String name, String bank, String address, String accountNum, String routingNum)
	{
		super(name, "Bank Account",bank,address);
		accountNumber = accountNum;
		routingNumber = routingNum;
	}

	public String GetAccountNumber(){return accountNumber;}
	public void SetAccountNumber(String number){accountNumber = number;}
	
	public String GetRoutingNumber(){return routingNumber;}
	public void SetRoutingNumber(String number){routingNumber = number;}
}
