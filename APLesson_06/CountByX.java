import java.util.Scanner;
public class CountByX
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input the last number of the loop:");
		int number = kb.nextInt();
		System.out.println("Please input the number you would like to iterate by:");
		int iterate = kb.nextInt();
		
		for(int i = iterate; i <= number; i+=iterate)
		{
			System.out.print(i + "\t");
		}
	}
}