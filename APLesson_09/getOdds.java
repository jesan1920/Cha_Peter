import java.util.Random;
public class getOdds
{
	static int[]numbers;
	
	public static void main (String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("\n" + getOdds() + "are odd numbers.");
	}
	
	public static void fillArray()
	{
		Random ran = new Random();
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = ran.nextInt(100);
	}
	
	public static void printArray()
	{
		for (int array : numbers)
			System.out.print(array + " ");
	}
	
	public static String getOdds()
	{
		String odds = "";
		for (int array : numbers)
		{
			if (array % 2 == 1)
				odds += array + " ";
		}
		
		return odds;
	}
}