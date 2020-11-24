package edu.cofc.cs656.services;

import java.util.List;
import java.util.ArrayList;

import edu.cofc.cs656.models.Task;
//import edu.cofc.cs656.models.Balance;
//import edu.cofc.cs656.models.Juicer;

public class TaskServices
{
	List<Task> tasks;
	
	public TaskServices()
	{
		tasks = new ArrayList<Task>();
	}
/*	
	public void ReserveTask ( int juicerId )
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
	}*/
}
