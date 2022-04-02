package repository;

import java.lang.*;
import java.util.ArrayList;
import entity.*;
import interfaces.*;

public class EmployeeRepo implements IEmployeeRepo
{
	DatabaseConnection dbc;
	
	public EmployeeRepo()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(Employee e)
	{
		String query = "INSERT INTO employees VALUES ('"+e.getEid()+"','"+e.getEName()+"','"+e.getDesignation()+"',"+e.getSalary()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String eid)
	{
		String query = "DELETE from employees WHERE eid='"+eid+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB(Employee e)
	{
		String query = "UPDATE employees SET eName='"+e.getEName()+"', designation = '"+e.getDesignation()+"', salary = "+e.getSalary()+" WHERE empId='"+e.getEid()+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public Employee searchEmployee(String eid)
	{
		Employee emp = null;
		String query = "SELECT `eName`, `designation`, `salary` FROM `employees` WHERE `empId`='"+eid+"';";     
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String ename = dbc.result.getString("ename");
				String designation = dbc.result.getString("designation");
				double salary = dbc.result.getDouble("salary");
				
				emp = new Employee();
				emp.setEId(eid);
				emp.setEName(ename);
				emp.setDesignation(designation);
				emp.setSalary(salary);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return emp;
	}
	public String[][] getAllEmployee()
	{
		ArrayList<Employee> ar = new ArrayList<Employee>();
		String query = "SELECT * FROM employees;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String eid = dbc.result.getString("eid");
				String ename = dbc.result.getString("ename");
				String designation = dbc.result.getString("designation");
				double salary = dbc.result.getDouble("salary");
				
				Employee e = new Employee(eid,ename,designation,salary);
				ar.add(e);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][4];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((Employee)obj[i]).getEid();
			data[i][1] = ((Employee)obj[i]).getEName();
			data[i][2] = ((Employee)obj[i]).getDesignation();
			data[i][3] = (((Employee)obj[i]).getSalary())+"";
		}
		return data;
	}
}