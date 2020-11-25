package model.edu.cofc.cs656.models;

public class PaymentMethod
{
	private String methodName;
	private String accountType;
	private String bankName;
	private String paymentAddress;
	
	public PaymentMethod(String name, String type, String bank, String address)
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
	
	public String toString()
	{
		return "[ name = " + methodName + "; accountType = " + accountType + "; bankName = " + bankName + "; paymentAddress = " + paymentAddress + "]";
	}
}