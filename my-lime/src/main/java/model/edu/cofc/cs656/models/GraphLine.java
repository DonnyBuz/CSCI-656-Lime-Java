package model.edu.cofc.cs656.models;

public class GraphLine
{
	String label;
	double[] data;
	
	public double[] GetData(){return data;}
	public void SetData(double[] d){data = d;}	
	
	public String GetLabel(){return label;}
	public void SetLabel(String name){label = name;}		
}