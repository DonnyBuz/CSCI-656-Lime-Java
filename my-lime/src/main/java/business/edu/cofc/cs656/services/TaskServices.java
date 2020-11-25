package business.edu.cofc.cs656.services;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

import model.edu.cofc.cs656.models.Task;
//import edu.cofc.cs656.models.Balance;
//import edu.cofc.cs656.models.Juicer;
import model.edu.cofc.cs656.models.Scooter;
//import business.edu.cofc.cs656.models.RepairServices;

public class TaskServices
{
	//JuicerServices
	List<Task> tasks;
	String status;
	
	public TaskServices()
	{
		tasks = new ArrayList<Task>();
		status = "TaskServices class created.";
	}
	
	public String CreateTask(Scooter scooter)
	{
		tasks.add(new Task(scooter.GetSooterID(),scooter.GetCurrentStatus(),1.0));
		return "Task created.";
	}
	
	public List<Task> ViewAllTasks() 
	{
		return tasks;
	}	
	
	public List<Task> ViewAvailableTasks() 
	{
		List<Task> availableTasks = new ArrayList<Task>();
		tasks.forEach((temp) -> 
		{
				if(temp.GetReservedStatus() == false)
				{
					availableTasks.add(temp);
				}
		});
		return availableTasks;
	}	
	
	public String ReserveTask( int taskID, int juicerID )
	{
		Task t = GetTaskFromID(taskID);
		if(t != null)
		{
			t.SetJuicerID(juicerID);
			t.SetReservedStatus(true);
			t.SetStatus("Reserved");
			return "Task reserved.";
		}
		else
		{
			return "Task ID not found.";
		}		
	}
	
	public String ReleaseTask(int taskID) 
	{
		Task t = GetTaskFromID(taskID);
		if(t != null)
		{
			t.SetReservedStatus(false);
			t.SetJuicerID(0);
			return "Task released.";
		}
		else
		{
			return "Task ID not found.";
		}
	}
	
	public String CompleteTask(int taskID)
	{
		Task t = GetTaskFromID(taskID);
		if(t != null)
		{
			t.SetStatus("Complete");
			return "Task completed.";
		}
		else
		{
			return "Task ID not found.";
		}		
		//UpdateBalance(juicer.GetBalance());
	}
	
//	public String CreateServiceRequest(int taskID) 
//	{
//		
//	}
	
	public Task GetTaskFromID(int taskID)
	{
		ListIterator<Task> tasksIterator = null;
		tasksIterator = tasks.listIterator();
		while(tasksIterator.hasNext())
		{
			if(tasksIterator.next().GetTaskID() == taskID)
			{
				return tasksIterator.previous();
				
			}
		}
		return null;
	}
	
//	private void UpdateBalance ( Balance b ) 
//	{
//		b.AddValue(value);
//	}
	
	public String toString()
	{
		return status;
	}
	
	
}
