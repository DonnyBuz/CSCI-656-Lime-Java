package edu.cofc.cs656.services;

public class SignUpServices 
{
	int num;
	public void CreateUser(int n)
	{
		num = n;
	}
	
	public String toString()
	{
		return String.valueOf(num);
	}
}
