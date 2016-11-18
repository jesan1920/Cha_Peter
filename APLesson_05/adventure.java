import java.util.Scanner;
public class adventure
{
	public static void main (String[]args)
	{
		Scanner kb= new Scanner (System.in);
		
		System.out.println("Let's go on an adventure. Medieval or futuristic?");
		String adventure = kb.next();
		kb.nextLine();
		if(adventure.equals("medieval"))
		{
			System.out.println("Are you a knight or a wizard?");
			String character = kb.next();
			if (character.equals("wizard"))
			{
				System.out.println("Wise choice. Do you specialize in fire or water?");
				String specialty = kb.next();
				if (specialty.equals("water"))
				{
					System.out.println("Congratulations! You slayed the dragon!");
				}
				else
				{
					System.out.println("Dragons are inpenetrable to fire. RIP.");
				}
			}
			else
			{
				System.out.println("You brought a sword to a magic fight. Looks like you're dead!");
			}
		}
		else
		{
			System.out.println("Are you a cyborg or a time traveler?");
			String character2 = kb.nextLine();
			if (character2.equals("time traveler"))
			{
				System.out.println("Wise choice. Do you go back in time or into the future?");
				String specialty2 = kb.nextLine();
				if (specialty2.equals("back in time"))
				{
					System.out.println("Congratulations! You stopped Trump from becoming president and the inevitable doom that follows!");
				}
				else
				{
					System.out.println("There is no future. Trump led to a global apocalypse.");
				}
			}
			else
			{
				System.out.println("Cyborgs don't exist because there is no future.");
			}
		}
	}
}