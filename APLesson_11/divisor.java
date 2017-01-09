import java.util.Random;
import java.util.Scanner;
public class divisor
{
	public static void main (String[]args)
	{
		Random num = new Random();
		Scanner kb = new Scanner(System.in);
		int[][]nums = new int [4][4];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = num.nextInt(100);
				
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Please enter a number:");
		int divisor = kb.nextInt();
		int count = 0;
		for(int i = 0; i <nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divisor == 0)
					count += 1;
			}
		}
		
		System.out.printf("There are %d numbers divisible by %d in the Array.", count, divisor);
	}
}