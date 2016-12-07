import java.util.Scanner;
public class revNumber
{
	static int num;
	static int rev = 0;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a number:");
		num = kb.nextInt();
		
		getReverse(num);
		print();
	}
	
	public static void getReverse(int num)
	{
		while (num>0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
	}
	
	public static void print()
	{
		System.out.printf("%d reversed is %d.",num,rev);
	}
}