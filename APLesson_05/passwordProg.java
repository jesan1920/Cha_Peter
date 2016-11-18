import java.util.Scanner;
public class passwordProg
{
	public static void main (String[]args)
	{
		recursion();
	}
	
	public static void recursion()
	{	
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter your username:");
		String username = kb.next();
		
		System.out.println("Enter your password:");
		String password = kb.next();
		
		if (username.equals("pcha99") && password.equals("dogsarecool"))
		{
			System.out.println("You are granted access!");
		}
		else if (username.equals("pcha99"))
		{
			System.out.println("Your password is incorrect!");
			recursion();
		}
		else if (password.equals("dogsarecool"))
		{
			System.out.println("Your username is incorrect!");
			recursion();
		}
		else
		{
			System.out.println("Your username and password are incorrect!");
			recursion();
		}
	}
}