package model.edu.cofc.cs656.models;

public class Subscription
{
	private static int index = 1000;
	private int id;
	private String subscriptionType;
	private double subscriptionCost;
	private int userID;
	private int paymentMethodID;
	
	public Subscription(String type, double cost, int userId, int paymentMethodId)
	{
		id = index;
		index++;
		subscriptionType = type;
		subscriptionCost = cost;
		userID = userId;
		paymentMethodID = paymentMethodId;
	}
	
	public int GetID(){return id;}
	public void SetID(int ID){id = ID;}
	
	public String GetType(){return subscriptionType;}
	public void SetType(String type){subscriptionType = type;}
	
	public double GetCost(){return subscriptionCost;}
	public void SetCost(double cost){subscriptionCost = cost;}
	
	public int GetUserID(){return userID;}
	public void SetUserID(int ID){userID = ID;}
	
	public int GetPaymentMethodID(){return paymentMethodID;}
	public void SetPaymentMethodID(int ID){paymentMethodID = ID;}
	
	public String toString()
	{
		return "{\"id\"=\""+String.valueOf(id)+",\"type\"=\""+subscriptionType+"\",\"cost\"=\""+String.valueOf(subscriptionCost)+"\",\"userID\"=\""+String.valueOf(userID)+"\",\"paymentMethodID\"=\""+String.valueOf(paymentMethodID)+"\"}";
	}
}
