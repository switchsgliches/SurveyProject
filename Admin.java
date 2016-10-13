
public class Admin extends User
{
	private String AdminName;
	private String AdminPassword;
	
	
	public Admin(String FirstName, String LastName, String AdName, String Password, int Age)
	{
		super(FirstName, LastName, Age);
		this.setAdminName(AdName);
		this.setAdminPassword(Password);
	}

	public String getAdminName()
	{
		return AdminName;
	}

	public void setAdminName(String adminName) 
	{
		this.AdminName = adminName;
	}

	public String getAdminPassword() 
	{
		return AdminPassword;
	}

	public void setAdminPassword(String adminPassword) 
	{
		this.AdminPassword = adminPassword;
	}
	
	public String toString()
	{
		return "" ;
	}

		
}
