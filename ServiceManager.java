
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
	
	public void Submit()
	{
		
	}
}

class RepairShop
{
	String name;
	String email;
	String physicalAddress;
	
	public void EmailShop(ServiceRequest sr)
	{
		
	}
}