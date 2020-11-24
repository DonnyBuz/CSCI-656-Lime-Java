package edu.cofc.cs656.models;

public class Graph
{
	private int numberLines;
	private String startDate;
	private String endDate;
	private String period;
	private String region;
//	private LineData[] data;

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