package entity;
import java.lang.*;

public class CarInfo
{
	String cRegNumber;
	int tokenNumber;
	String date;
	String time;
	
	public CarInfo(){}
	public CarInfo(String cRegNumber, int tokenNumber, String date, String time)
	{
		this.cRegNumber = cRegNumber;
		this.tokenNumber = tokenNumber;
		this.date = date;
		this.time = time;
	}
	
	public void setCRegNumber(String cRegNumber)
	{
		this.cRegNumber = cRegNumber;
	}
	public void setTokenNumber(int tokenNumber)
	{
		this.tokenNumber = tokenNumber;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	public void setTime(String time)
	{
		this.time = time;
	}
	
	
	public String getCRegNumber()
	{
		return cRegNumber;
	}
	public int getTokenNumber()
	{
		return tokenNumber;
	}
	public String getDate()
	{
		return date;
	}
	public String getTime()
	{
		return time;
	}
}