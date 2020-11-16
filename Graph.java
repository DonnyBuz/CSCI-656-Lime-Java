
class Graph
{
	private int numberLines;
	private String startDate;
	private String endDate;
	private String period;
	private String region;
	private LineData[] data;

	Graph()
	{
		
	}

	public String GetStartDate(){return startDate;}
	public void SetStartDate(String date){startDate = date;}

	public String GetEndDate(){return endDate;}
	public void SetEndDate(String date){endDate = date;}
	
	public String GetPeriod(){return period;}
	public void SetPeriod(String p){period = p;}

	public String GetRegion(){return region;}
	public void SetRegion(String r){region = r;}
	
	public void AddLine(String name)
	{
		
	}
	
	public void RemoveLine(String name) 
	{
				
	}
	
	
}

class LineData
{
	String label;
	double[] data;
	
	public double[] GetData(){return data;}
	public void SetData(double[] d){data = d;}	
	
	public String GetLabel(){return label;}
	public void SetLabel(String name){label = name;}		
}