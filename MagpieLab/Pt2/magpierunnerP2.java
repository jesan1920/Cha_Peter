import java.util.Scanner;
public class magpierunnerP2
{
	public static void main(String[] args)
	{
		magpieP2 maggie = new magpieP2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
