package model.edu.cofc.cs656.models;

public class PaymentMethod
{
	private static int index = 1000;
	protected int id;
	protected String methodName;
	protected String accountType;
	protected String bankName;
	protected String paymentAddress;
	protected int userID;
	
	public PaymentMethod(String name, String bank, String address)
	{
		id = index;
		index++;
		methodName = name;
		accountType = "unknown";
		bankName = bank;
		paymentAddress = address;
	}

	public int GetID(){return id;}
	public void SetID(int ID){id = ID;}
	
	public String GetName(){return methodName;}
	public void SetName(String name){methodName = name;}	
	
	public String GetAccountType(){return accountType;}
	public void SetAccountType(String type){accountType = type;}
	
	public String GetBankName(){return bankName;}
	public void SetBankName(String name){bankName = name;}
	
	public String GetPaymentAddress(){return paymentAddress;}
	public void SetPaymentAddress(String address){paymentAddress = address;}
	
	public int GetUserID(){return userID;}
	public void SetUserID(int id){userID = id;}
	
	public String toString()
	{
		return "{\"id\"=\""+String.valueOf(id)+",\"methodName\"=\""+methodName+"\",\"accountType\"=\""+accountType+"\",\"bankName\"=\""+bankName+"\",\"paymentAddress\"=\""+paymentAddress+"\",\"userID\"=\""+String.valueOf(userID)+"\"}";
	}
}