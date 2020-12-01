package model.edu.cofc.cs656.models;

public class Balance
{
	private double amount;
	
	Balance()
	{
		amount = 0.0;
	}
	private double GetBalance(){return amount;}
	private void SetBalance( double bal ){amount = bal;}
	
	public void AddValue( double add_amount )
	{
		amount = amount + add_amount;
	}
	
	public void Transfer( TransferAccount account )
	{
		account.Transfer(amount);
		SetBalance( 0 );
	}
}