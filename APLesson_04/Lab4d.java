import java.util.Scanner;

public class Lab4d
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches:");
		int height = kb.nextInt();
		
		System.out.println("Enter length in inches:");
		int length = kb.nextInt();
		
		System.out.println("Enter width in inches:");
		int width = kb.nextInt();
		
		Lab4d volume = new Lab4d();
		double vol = volume.calcVol(height,length,width);
		System.out.println("The volume of the subwoofer is " + vol + " cubic feet.");
	}
	
	public double calcVol(int h, int l, int w)
	{
		return (h*l*w)/1728;
	}
}