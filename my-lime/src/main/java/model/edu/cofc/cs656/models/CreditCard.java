package model.edu.cofc.cs656.models;

public class CreditCard extends PaymentMethod
{
	private String cardNumber;
	private String expiration;
	private String CCV;

	public CreditCard(String name, String bank, String address, String cardNum, String exp, String ccvCode)
	{
		super(name,bank,address);
		accountType = "Credit Card";
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
	
	public String toString()
	{
		return "{\"id\"=\""+String.valueOf(id)
		+",\"methodName\"=\""+methodName
		+"\",\"accountType\"=\""+accountType
		+"\",\"bankName\"=\""+bankName
		+"\",\"paymentAddress\"=\""+paymentAddress
		+"\",\"userID\"=\""+String.valueOf(userID)
		+"\",\"cardNumber\"=\""+cardNumber
		+"\",\"expiration\"=\""+expiration
		+"\",\"CCV\"=\""+CCV
		+"\"}";
	}
}
