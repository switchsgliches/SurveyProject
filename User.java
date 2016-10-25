public class User 
{
	public String FirstName;
	public String LastName;
	public int Age;
	
	public User(String firstname, String lastname, int age)
	{
		FirstName = firstname;
		LastName = lastname;
		Age = age;
	}
	
	
	public void setFirstName(String Firstname)
	{
		this.FirstName = Firstname;
	}
	
	public String getFirstName()
	{
		return FirstName ;
	}
	
	public void setLastName(String Lastname)
	{
		this.LastName = Lastname;
	}
	
	public String getLastName()
	{
		return LastName ;
	}
	
	public void setAge(int age)
	{
		this.Age = age;
	}
	
	public int Age()
	{
		return Age ;
	}
	

}