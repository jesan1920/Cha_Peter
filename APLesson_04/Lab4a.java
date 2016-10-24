import java.util.Scanner;

public class Lab4a
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter item 1:");
		String thing1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		Double cost1 = kb.nextDouble();
		
		System.out.println("Please enter item 2:");
		String filler = kb.nextLine();
		String thing2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		Double cost2 = kb.nextDouble();
		String filler1 = kb.nextLine();
		
		System.out.println("Please enter item 3:");
		String thing3 = kb.nextLine();
		
		System.out.println ("Please enter the price:");
		Double cost3 = kb.nextDouble();
		
		String subtotal = ("Subtotal:");
		Double subtotalp = cost1 + cost2 + cost3;
		String tax = ("Tax:");
		Double taxp = subtotalp * 0.07;
		String total = ("Total:");
		Double totalp = subtotalp + taxp;
		
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>\n\n");
			
		Lab4a form = new Lab4a();
		String item1 = thing1;
		Double price1 = cost1;
		form.format(item1,price1);
		
		String item2 = thing2;
		Double price2 = cost2;
		form.format(item2,price2);
		
		String item3 = thing3;
		Double price3 = cost3;
		form.format(item3,price3);
		System.out.println("\n");
		
		String calc1 = subtotal;
		Double calcp1 = subtotalp;
		form.format(calc1,calcp1);
		
		String calc2 = tax;
		Double calcp2 = taxp;
		form.format(calc2,calcp2);
		
		String calc3 = total;
		Double calcp3 = totalp;
		form.format(calc3,calcp3);
		
		System.out.println("\n__________________________________________");
		System.out.println("       *Thank you for your support*       ");
	}
	
	public void format (String item, Double price)
	{
	
		System.out.printf("* %15s ........%10.2f\n",item,price);
	}
	
}