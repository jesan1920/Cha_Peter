import java.util.Scanner;

public class Lab4c
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the interest rate:");
		Double rate = kb.nextDouble();
		
		System.out.println("Enter the principal:");
		Double principal = kb.nextDouble();
		
		System.out.println("Enter the number of times the loan is compounded per year:");
		Double number = kb.nextDouble();
		
		System.out.println("Enter the life of the loan in years:");
		Double time = kb.nextDouble();
		
		Lab4c interest = new Lab4c();
		
		System.out.printf("Your monthly payment will be $%3.2f",interest.payment(rate,principal,number,time));
	}
	
	public double payment(double r, double p, double n, double t)
	{
		return (p*Math.pow((1+(r/n)),n*t))/12;
	}
}