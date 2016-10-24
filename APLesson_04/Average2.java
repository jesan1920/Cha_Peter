import java.util.Scanner;
public class Average2
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		double num1= kb.nextDouble();
		
		System.out.println("Enter the second number:");
		double num2 = kb.nextDouble();
		
		System.out.println("Enter the third number:");
		double num3 = kb.nextDouble();
		
		print(num1, num2, num3, calcAverage(num1,num2,num3));
		
	}
	
	public static double calcAverage(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void print (double num1, double num2, double num3, double average)
	{
		System.out.printf("The average of %1.0f, %1.0f, and %1.0f is %3.5f.", num1, num2, num3, average);
	}
}