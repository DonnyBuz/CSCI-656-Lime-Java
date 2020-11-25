package model.edu.cofc.cs656.models;

public class TransferAccount
{
	private String name;
	private String accountType;
	private String bankName;
	private String paymentAddress;
	private String accountNumber;
	private String routingNumber;
	
	TransferAccount()
	{
		
	}
	
	public String GetName(){return name;}
	public void SetName(String n){name = n;}

	public String GetType(){return accountType;}
	public void SetType(String type){accountType = type;}

	public String GetBankName(){return bankName;}
	public void SetBankName(String name){bankName = name;}

	public String GetPaymentAddress(){return paymentAddress;}
	public void SetPaymentAddress(String address){paymentAddress = address;}
	
	public String GetAccountNumber(){return accountNumber;}
	public void SetAccountNumber(String accountNum){accountNumber = accountNum;}
	
	public String GetRoutingNumber(){return routingNumber;}
	public void SetRoutingNumber(String routingNum){routingNumber = routingNum;}
	
	public void Transfer( double amount )
	{
		String str = String.format("%f",amount);
		System.out.println("Balance Transfered. $"+str);	
	}
}