package entity;
import java.lang.*;

public class User
{
	private String userId;
	private String password;
	private String status;
	//private Car car
	
	public User(){}
	public User(String userId, String password, String status)
	{
		this.userId = userId;
		this.password = password;
		this.status = status;
	}
	
	/*public void setUName(String uname)
	{
		this.uname = uname;
	}*/
	public void setUid(String userId)
	{
		this.userId = userId;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	/*public void setCar(Car car)
	{
		this.car = car;
	}*/
	
	/*public String getUName()
	{
		return uname;
	}*/
	public String getUserId()
	{
		return userId;
	}
	public String getPassword()
	{
		return password;
	}
	public String getStatus()
	{
		return status;
	}
	/*public Car getCar()
	{
		return car;
	}*/
}