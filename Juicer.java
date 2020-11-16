

class Juicer
{
	private String email;
	private String password;
	private String name;
	private String birthday;
	private String physicalAddress;
	private String ssn;
	private Task currentTask;
	
	public void RegisterJuicer()
	{
		
	}
	
	public void Login()
	{
			
	}
	
	public void Logout() 
	{
		
	}
	
	public void UpdateAccount() 
	{
		
	}
	
	public Task[] ViewAvailableTasks() 
	{
		Task[] tasks = new Task[2];
		return tasks;
	}
	
	public void AddTask( Task t ) 
	{
			
	}
	
	public void CancelTask(Task t) 
	{
		
	}
	
	public void AddTransferAccount( TransferAccount account ) 
	{	
		
	}
	
}

class Balance
{
	private double amount;
	
	public void AddValue( double ammount )
	{
		
	}
	
	public void Transfer( TransferAccount account )
	{
			
	}
}


class TransferAccount
{
	private double name;
	private double type;
	private double bankName;
	private double paymentAddress;
	private double accountNumber;
	private double rountingNumber;
}
