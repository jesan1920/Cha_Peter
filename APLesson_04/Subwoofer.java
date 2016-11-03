import java.util.Scanner;

public class Subwoofer
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches:");
		double height = kb.nextDouble();
		
		System.out.println("Enter length in inches:");
		double length = kb.nextDouble();
		
		System.out.println("Enter width in inches:");
		double width = kb.nextDouble();
		
		Subwoofer volume = new Subwoofer();
		double vol = volume.calcVol(height,length,width);
		System.out.println("The volume of the subwoofer is " + vol + " cubic feet.");
	}
	
	public double calcVol(double h, double l, double w)
	{
		return (h*l*w)/1728;
	}
}