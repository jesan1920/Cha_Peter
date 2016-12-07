import java.util.Scanner;
public class DigitAdder
{
	static int sum = 0;
	static int num;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please input a number:");
		num = kb.nextInt();
		
		sumDigits(num);
		print();
	}
	
	public static void sumDigits(int num)
	{
		while(num>0)
		{
			sum += num % 10;
			num /= 10;
		}
	}
	
	public static void print()
	{
		System.out.printf("The sum of the digits in %d is %d.", num, sum);
	}
}