import java.util.Scanner;
public class underscores
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		System.out.println(replace(kb.nextLine()));
	}
	
	public static String replace(String sentence)
	{
		while(sentence.indexOf(" ") <= 0)
			return sentence;
		return replace (sentence.substring(0,sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1));
	}
}