import java.util.Random;
public class biggestNumber
{
	static int[]numbers;
	
	public static void main (String[]args)
	{
		numbers = new int[10];
		fillArray();
		
		System.out.println("For the following numbers...");
		printArray();
		System.out.printf("\nThe biggest number is %d.",getBiggest());
	}
	
	public static void fillArray()
	{
		Random ran = new Random();
		
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = ran.nextInt(100);
	}
	
	public static void printArray()
	{
		for (int array : numbers)
			System.out.print(array + " ");
	}
	
	public static int getBiggest()
	{
		int max = 0;
		for (int array : numbers)
		{
			if(array > max)
				max = array;
		}
		
		return max;
	}
}