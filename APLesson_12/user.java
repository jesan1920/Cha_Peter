import java.util.Scanner;
public class user
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;

	public user()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	public user(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public user(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAvatar: " + avatar + "\nUser ID#: " + userID;
	}
	
	public static void main (String[]args)
	{
		user user1;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input your first name:");
		String firstName = kb.next();
		System.out.println("Please input your last name:");
		String lastName = kb.next();
		System.out.println("Would you like to use a public avatar? (y or n) ");
		String yesNo = kb.next();
		
		if (yesNo.equals("n"))
		{
			user1 = new user(firstName, lastName);
			System.out.println(user1);
		}
		
		if (yesNo.equals("y"))
		{
			System.out.println("Please input your avatar:");
			String avatar = kb.next();
			user1 = new user(firstName, lastName, avatar);
			System.out.println(user1);
		}
	}
}