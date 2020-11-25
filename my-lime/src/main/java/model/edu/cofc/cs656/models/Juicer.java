package model.edu.cofc.cs656.models;

public class Juicer extends User
{
	private Task currentTask;
	private double balance;
	
	public Juicer(String e, String pass, String n, String ss)
	{
		super(e,pass,n,ss);
		userType = "Juicer";
	}
	
	public Task GetCurrentTask(){return currentTask;}
	public void SetCurrentTask(Task t){currentTask = t;}

	public double GetBalance(){return balance;}
	public void SetBalance(double bal){balance = bal;}
		
//	public void AddTransferAccount( TransferAccount account ) 
	{	
		
	}
	
}