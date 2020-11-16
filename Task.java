
class Task
{
	private double value;
	private String title;
	private String description;
	private boolean reserved;
	private String status;
	private Juicer juicer;

	public double GetValue(){return value;}
	public void SetValue(double val){value = val;}	
	
	public String GetTitle(){return title;}
	public void SetTitle(String name){title = name;}
	
	public String GetDescription(){return description;}
	public void SetDescription(String descr){description = descr;}
	
	public String GetStatus(){return status;}
	public void SetStatus(String stat){status = stat;}
		
	public void ReserveTask ( Juicer j )
	{
		juicer = j;
		reserved = true;
	}
	
	public void ReleaseTask () 
	{
		reserved = false;
	}
	
	public void CompleteTask()
	{
		UpdateBalance(juicer.GetBalance());
	}
	
	public void CreateServiceRequest() 
	{
		
	}
	
	private void UpdateBalance ( Balance b ) 
	{
		b.AddValue(value);
	}
}