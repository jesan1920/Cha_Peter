import java.util.Scanner;
public class firstLetter
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[]words = new String[5];
		
		System.out.println("Please input 5 words:");
		for (int i = 0; i < words.length; i++)
			words[i] = kb.next();
		
		first(words);
	}
	
	public static void first(String[]words)
	{
		for (String first: words)
			System.out.println(first.charAt(0));
	}
}