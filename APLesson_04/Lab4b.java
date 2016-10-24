import java.util.Scanner;

public class Lab4b
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String fName = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String lName = kb.nextLine();
		
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.println("\n****************************************");
		
		Lab4b form = new Lab4b();
		
		String one = school;
		String two = year;
		form.format(one,two);
		
		String three = fName;
		String four = lName;
		form.format(three,four);
		
		String five = title;
		String six = subject;
		form.format(five,six);
		
		System.out.println("****************************************");
	}
	
	public void format (String odd, String even)
	{
		System.out.printf("* %15s %20s *\n",odd,even);
	}
}