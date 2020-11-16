

class Juicer
{
	private String email;
	private String password;
	private String name;
	private String birthday;
	private String homeAddress;
	private String ssn;
	private Task currentTask;
	
	Juicer()
	{
		
	}
	
	public String GetEmail(){return email;}
	public void SetEmail(String e){email = e;}

	public String GetPassword(){return password;}
	public void SetPassword(String pass){password = pass;}
	
	public String GetName(){return name;}
	public void SetName(String n){name = n;}
	
	public String GetBirthday(){return birthday;}
	public void SetBirthday(String bday){birthday = bday;}
	
	public String GetAddress(){return homeAddress;}
	public void SetAddress(String address){homeAddress = address;}
	
	public String GetSSN(){return ssn;}
	public void SetSSN(String ss){ssn = ss;}
	
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


class TransferAccount
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
