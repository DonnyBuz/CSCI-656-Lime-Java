
class Graph
{
	private int numberLines;
	private String startDate;
	private String endDate;
	private String period;
	private String region;
	private LineData[] data;

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
	
	public void GetData(String name)
	{
			System.out.println("LineData");
	}
}