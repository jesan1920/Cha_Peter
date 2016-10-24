import java.util.Scanner;
public class Circle2
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		double r = kb.nextDouble();
		
		print (r,calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return Math.pow(r,2)*3.14;
	}
	
	public static void print (double r, double area)
	{
		System.out.printf("The area of the circle with a radius of %1.0f is %3.5f.",r,area);
	}
}