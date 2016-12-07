import java.util.Scanner;
public class avgDigits
{
	static int num;
	static int digits = 0;
	static double average = 0;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a number:");
		num = kb.nextInt();
		
		avgDigits(num);
		print();
		
	}
	
	public static void avgDigits(int num)
	{
		while(num>0)
		{
			digits += 1;
			average += num % 10;
			num /= 10;
		}
		average = average / digits;
	}
	
	public static void print ()
	{
		System.out.printf("The average of the digits in %d is %.1f.",num,average);
	}
}