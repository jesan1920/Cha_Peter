import java.util.Scanner;
public class Circle
{
	static double r;
	static double area;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Enter the radius:");
		r = kb.nextDouble();
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = Math.pow(r,2)*3.14;
	}
	
	public static void print()
	{
		System.out.printf("The area of the circle with a radius of%2.0f is %3.5f.",r,area);
	}
}