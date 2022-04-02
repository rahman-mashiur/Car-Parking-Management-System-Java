package entity;
import java.lang.*;

public class Employee
{
	private String ename;
	private String eid;
	private String designation;
	private double salary;
	
	public Employee(){}
	public Employee(String ename, String eid, String designation, double salary)
	{
		this.ename = ename;
		this.eid = eid;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void setEName(String ename)
	{
		this.ename = ename;
	}
	public void setEId(String eid)
	{
		this.eid = eid;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getEName()
	{
		return ename;
	}
	public String getEid()
	{
		return eid;
	}
	public String getDesignation()
	{
		return designation;
	}
	public double getSalary()
	{
		return salary;
	}
}