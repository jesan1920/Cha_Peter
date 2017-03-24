 import java.util.Random;
 public class Car implements Location
 {
	Random ran = new Random();
	public double[] location;
	public int ID = ran.nextInt(100000) + 100000 * ran.nextInt(10);
	
	public Car()
	{
		location = new double[2];
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		location[0] = x;
		location[1] = y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
 }