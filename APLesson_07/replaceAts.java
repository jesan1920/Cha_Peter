import java.util.Scanner;
public class replaceAts
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		sentence = kb.nextLine();
		
		replace(sentence);
		print();
	}
	
	public static void replace(String a)
	{
		while(a.indexOf("a") >= 0)
		{
			a = a.substring(0,a.indexOf("a")) + a.substring(sentenc.indexOf("a")+1) + "@";
		}
		sentence = a;
	}
	
	public static void print()
	{
		System.out.println(sentence);
	}
}