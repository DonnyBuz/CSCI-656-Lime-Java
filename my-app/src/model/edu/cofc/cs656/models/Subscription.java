package edu.cofc.cs656.models;

class Subscription
{
	private String subscriptionType;
	private double subscriptionCost;
	
	public Subscription(String type, double cost)
	{
		subscriptionType = type;
		subscriptionCost = cost;
	}
	
	public String GetType(){return subscriptionType;}
	public void SetType(String type){subscriptionType = type;}
	
	public double GetCost(){return subscriptionCost;}
	public void SetCost(double cost){subscriptionCost = cost;}
	
	public String toString()
	{
		return "[type = " + subscriptionType + ", cost = " + String.valueOf(subscriptionCost) +"]";
	}
}
