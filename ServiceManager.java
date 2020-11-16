
class ServiceManager
{
	private int numberServiceRequests;
	
	public ServiceRequest[] ViewServiceRequests()
	{
		ServiceRequest[] sr = new ServiceRequest[2];
		return sr;
	}
	
	public RepairShop[] ViewRepairShops() 
	{
		RepairShop[] rs = new RepairShop[2];
		return rs;	
	}
}

class ServiceRequest
{
	String issueDescription;
	int serviceCode;

	public String GetIssueDescription(){return issueDescription;}
	public void SetIssueDescription(String description){issueDescription = description;}	
	
	public int GetServiceCode(){return serviceCode;}
	public void SetServiceCode(int code){serviceCode = code;}
	
	public void Submit()
	{
		
	}
}

class RepairShop
{
	String name;
	String email;
	String physicalAddress;

	RepairShop()
	{
		
	}

	public String GetName(){return name;}
	public void SetName(String n){name = n;}
	
	public String GetEmail(){return email;}
	public void SetEmail(String e){email = e;}
	
	public String GetAddress(){return physicalAddress;}
	public void SetAddress(String address){physicalAddress = address;}	
	
	public void EmailShop(ServiceRequest sr)
	{
		
	}
}