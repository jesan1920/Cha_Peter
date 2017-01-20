import java.lang.Math.*;
import java.util.Scanner;
public class mph
{
	private int distance, hours, minutes;
	private double mph;
	
	public mph()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public mph (int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public void setValues (int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input distance:");
		int distance = kb.nextInt();
		System.out.println("Please input hours:");
		int hours = kb.nextInt();
		System.out.println("Please input minutes:");
		int minutes = kb.nextInt();
		
		mph object = new mph(distance, hours, minutes);
		System.out.printf("%d miles in %d hours %d minutes = %.2f mph\n", object.getDistance(), object.getHours(), object.getMinutes(), object.getMPH());
		
		object.setValues(500, 5, 30);
		System.out.printf("%d miles in %d hours %d minutes = %.2f mph", object.getDistance(), object.getHours(), object.getMinutes(), object.getMPH());
	}
}