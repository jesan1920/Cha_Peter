import java.util.Random;
public class avgNumbers
{
	public static void main (String[]args)
	{
		Random ran = new Random();
		int[]numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = ran.nextInt(100);
		
		System.out.println("Numbers...");
		for (int i: numbers)
			System.out.print(i + " ");
		
		System.out.printf("\nThe average of the above numbers is %.2f.",average(numbers));
	}
	
	public static double average(int[]numbers)
	{
		double average = 0;
		for (int num: numbers)
			average += num;
		return average/((int)numbers.length);
	}
}