import java.util.Scanner;
public class magpierunnerP3
{
	public static void main(String[] args)
	{
		magpieP3 maggie = new magpieP3();
		
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
