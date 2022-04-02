package interfaces;
import java.lang.*;
import entity.*;

public interface IEmployeeRepo
{
	public void insertInDB(Employee e);
	public void deleteFromDB(String eid);
	public void updateInDB(Employee e);
	public Employee searchEmployee(String eid);
	public String[][] getAllEmployee();
}