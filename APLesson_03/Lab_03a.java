import java.util.Scanner;

public class Lab_03a
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I'm RudeAI.\nI'm going to ask you a couple questions.\nWhat is your name?");
		String name=keyboard.next();
		System.out.println("Wow, that ruins the name \""+name+"\" for me.\nHow old are you, "+name+"?");
		int age=keyboard.nextInt();
		System.out.println(age+"? That sucks."+"\nWhat do you do for fun, "+name+"?");
		String hobby=keyboard.next();
		System.out.println("You like to "+hobby+"? How boring are you?\nWhat kind of music do you like?");
		String music=keyboard.next();
		System.out.println("You like "+music+"? Your music taste is worse than a millennial's!\nHow many siblings do you have?");
		int siblings=keyboard.nextInt();
		System.out.println("Please tell me your "+siblings+" siblings are nothing like you.\nWhat do you want to be when you grow up?");
		String job=keyboard.next();
		System.out.println("Are you kidding me? You'll never be able to become a "+job+"!");
	}
}