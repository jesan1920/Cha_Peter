import java.util.Scanner;
public class findtheZs
{
	static String[]words;
	
	public static void main (String[]args)
	{
		words = new String[5];
		fillArray();
		
		System.out.println("For the words");
		printArray();
		System.out.println("\nOnly " + hasZs() + "contain(s) the letter z.");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input 5 words:");
		for (int i = 0; i < words.length; i++)
			words[i] = kb.next();
	}
	
	public static void printArray()
	{
		for (String array: words)
			System.out.print(array + " ");
	}
	
	public static String hasZs()
	{
		String zs = "";
		for (String array : words)
		{
			if (array.indexOf("z") >= 0)
				zs += array + " ";
		}
		
		return zs;
	}
}