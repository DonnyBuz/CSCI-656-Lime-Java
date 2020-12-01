package model.edu.cofc.cs656.models;


public class User
{
	private static int index = 1000;
	private int userID;
	private String email;
	private String password;
	private String name;
	private String birthday;
	private String homeAddress;
	private String ssn;
	protected String userType;
	
	public User(String userEmail, String userPassword, String userName, String ss)
	{
		userID = index;
		email = userEmail;
		password  = userPassword;
		name = userName;
		ssn = ss;
		index++;
	}
	
	public int GetUserID(){return userID;}
	
	public String GetEmail(){return email;}
	public void SetEmail(String e){email = e;}

	public String GetPassword(){return password;}
	public void SetPassword(String pass){password = pass;}
	
	public String GetName(){return name;}
	public void SetName(String n){name = n;}	
	
	public String GetBirthday(){return birthday;}
	public void SetBirthday(String bday){birthday = bday;}
	
	public String GetAddress(){return homeAddress;}
	public void SetAddress(String address){homeAddress = address;}
	
	public String GetSSN(){return ssn;}
	public void SetSSN(String ss){ssn = ss;}
	
	public String toString()
	{
		return "{\"userID\":\""+String.valueOf(userID)+"\",\"email\":\""+email+"\",\"password\":\"xxxxxxxxxx\",\"name\":\""+name+"\",\"birthday\":\""+birthday+"\",\"homeAddress\":\""+homeAddress+"\",\"ssn\":\"xxx-xx-xxxx\"}";
	}
}
