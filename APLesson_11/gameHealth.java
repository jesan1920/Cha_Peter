import java.util.Scanner;
import java.util.Random;
public class gameHealth
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthCount;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Random num = new Random();
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while (turn != "Q" && healthCount > 0)
		{
			System.out.println("\n\nYour turn! Hit Enter when ready:");
			turn = kb.nextLine();
			damage = num.nextInt(2) + 1;
			amount = num.nextInt(6) + 1;
			System.out.print(takeDamage(damage,amount));
			printClip();
		}
		
		System.out.println("\nYou died!!!");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
	if(dmg ==1)
	{
		healthCount -= amt;
		return "Taking " + amt + " damage!";
	}
	else
	{
		if(healthCount + amt < HEALTHLOAD)
			healthCount += amt;
		else
			healthCount = HEALTHLOAD;
	}
	
	return "Power Up " + amt + "! ";
	}
	
	public static void printClip()
	{
		String output = "\nHealth:\t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
				health[i] = " @ ";
			else
				health[i] = "[]";
			output += health[i];
		}
		
		System.out.print(output);
	}
}