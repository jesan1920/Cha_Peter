import java.util.Random;
public class randomNumbers
{
	public static void main (String[]args)
	{
		Random num = new Random();
		int[][]nums = new int [4][4];
		
		for(int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = num.nextInt(10);
				
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}