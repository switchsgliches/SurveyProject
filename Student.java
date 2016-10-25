

public class Student extends User
{
	private String StudentName;
	private String StudentPassword;
	
	
	public Student(String FirstName, String LastName, String StName , String Password, int Age)
	{
		super(FirstName, LastName, Age);
		this.setStudentName(StName);
		this.setStudentPassword(Password);
	}
	
	public String getStudentName()
	{
		return StudentName;
	}

	private void setStudentPassword(String password) 
	{
		this.StudentPassword = password;
		
	}
	
	public String getStudentPassword()
	{
		return StudentPassword;
	}
	
	private void setStudentName(String StName) 
	{
		this.StudentName = StName;
		
	}
	
	public String toString()
	{
		return "" ;
	}

}
