import java.util.Scanner;
public class center
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a word:");
		String w1 = kb.next();
		
		System.out.println("Please input another word:");
		String w2 = kb.next();
		
		System.out.println("Please input one last word:");
		String w3 = kb.next();
		
		System.out.println(makeCenter(w1));
		System.out.println(makeCenter(w2));
		System.out.println(makeCenter(w3));
	}
	
	public static String makeCenter(String word)
	{
		while (word.length() >= 20)
			return word;
		return makeCenter(" " + word + " ");
	}
}