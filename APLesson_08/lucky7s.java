import java.util.Scanner;
public class lucky7s
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a number:");
		System.out.println(luck(kb.nextInt()));
	}
	
	public static int luck(int number)
	{
		if (number>0)
		{
			if (number % 10 == 7)
				return 1 + luck(number/10);
			else 
				return 0 + luck(number/10);
		}
		else
			return 0;
	}
}