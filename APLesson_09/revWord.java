import java.util.Scanner;
public class revWord
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[]words = new String[5];
		
		System.out.println("Please input 5 words:");
		for (int i = 0; i < words.length;i++)
			words[i] = kb.next();
		
		System.out.println("In order...");
		for (String word: words)
			System.out.println(word);
		
		System.out.println("\nReversed...");
		for (String word: words)
			System.out.println(reverse(word));
	}
	
	public static String reverse(String word)
	{
		String reverse = "";
		for (int i = 1; i <= word.length(); i++)
			reverse += word.charAt(word.length()-i);
		return reverse;
	}
}