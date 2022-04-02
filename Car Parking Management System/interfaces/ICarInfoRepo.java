package interfaces;
import java.lang.*;
import entity.*;

public interface ICarInfoRepo
{
	void insertCar(Car c);
	void updateCar(Car c);
	void deleteCar(String cRegNumber);
	public String[][] getAllCarInfo();
}