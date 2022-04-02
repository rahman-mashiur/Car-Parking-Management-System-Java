package repository;

import java.lang.*;
import entity.*;
import interfaces.*;

public class CarInfoRepo implements ICarInfoRepo
{
	DatabaseConnection dbc;
	
	public CarInfoRepo()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(Car c)
	{
		String query = "INSERT INTO carsInfo VALUES ('"+c.getCRegNumber()+"','"+c.getTokenNumber()+"','"+c.getDate()+"','"+c.getTime()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String cRegNumber)
	{
		String query = "DELETE from carsInfo WHERE cRegNumber='"+cRegNumber+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB(Car c)
	{
		String query = "UPDATE carsInfo SET tokenNumber='"+c.getTokenNumber()+"', date = '"+c.getDate()+"', time = '"+c.getTime()+" WHERE cRegNumber='"+c.getCRegNumber()+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public CarInfo searchCar(String cRegNumber)
	{
		CarInfo car = null;
		String query = "SELECT `tokenNumber`,`date`, `time` FROM `carsInfo` WHERE `cRegNumber`='"+cRegNumber+"';";     
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				int tokenNumber = dbc.result.getString("tokenNumber");
				String date = dbc.result.getString("date");
				String time = dbc.result.getString("time");
				
				car = new CarInfo();
				car.setCRegNumber(cRegNumber);
				car.setTokenNumber(tokenNumber);
				car.setDate(date);
				cars.setTime(time);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return car;
	}
	public String[][] getAllCarInfo()
	{
		ArrayList<CarInfo> ar = new ArrayList<CarInfo>();
		String query = "SELECT * FROM carsinfo;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String cRegNumber = dbc.result.getString("cRegNumber");
				int tokenNumber = dbc.result.getInt("tokenNumber");
				String date = dbc.result.getString("date");
				String time = dbc.result.getString("time");
				
				CarInfo c = new CarInfo(cRegNumber,tokenNumber,date,time);
				ar.add(c);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][4];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((CarInfo)obj[i]).getCRegNumber();
			data[i][1] = ((CarInfo)obj[i]).getTokenNumber();
			data[i][0] = ((CarInfo)obj[i]).getDate();
			data[i][2] = ((CarInfo)obj[i]).getTime()+"";
		}
		return data;
	}
}