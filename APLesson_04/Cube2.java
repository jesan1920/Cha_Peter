import java.util.Scanner;
public class Cube2
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the side:");
		double side = kb.nextDouble();
		
		print(side,calcSurf(side));
	}
	
	public static double calcSurf(double side)
	{
		return Math.pow(side,2)*6;
	}
	
	public static void print (double side, double surfArea)
	{
		System.out.printf("The surface area of a cube whose sides are %1.0f in length is %3.5f.", side, surfArea);
	}
}