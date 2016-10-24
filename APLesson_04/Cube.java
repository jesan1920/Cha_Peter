import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Enter the length of the side:");
		side = kb.nextDouble();
		
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = Math.pow(side,2)*6;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are%2.0f in length is %3.5f.",side,sa);
	}
}