import java.lang.Math.*;
import java.util.Scanner;
public class distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = 0;
	}
	
	public void setValues(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = 0;
	}
	
	public int getxOne()
	{
		return xOne;
	}
	
	public int getyOne()
	{
		return yOne;
	}
	
	public int getxTwo()
	{
		return xTwo;
	}
	
	public int getyTwo()
	{
		return yTwo;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
		return distance;
	}
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input x1:");
		int xOne = kb.nextInt();
		System.out.println("Please input y1:");
		int yOne = kb.nextInt();
		System.out.println("Please input x2:");
		int xTwo = kb.nextInt();
		System.out.println("Please input y2:");
		int yTwo = kb.nextInt();
		
		distance object = new distance(xOne, yOne, xTwo, yTwo);
		System.out.printf("The distance between (%d,%d) and (%d,%d) is %.2f.\n", object.getxOne(), object.getyOne(), object.getxTwo(), object.getyTwo(), object.getDist());
		
		object.setValues(1, 0, 2, 0);
		System.out.printf("The distance between (%d,%d) and (%d,%d) is %.2f.", object.getxOne(), object.getyOne(), object.getxTwo(), object.getyTwo(), object.getDist());
	}
}