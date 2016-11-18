import java.util.Scanner;

public class receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		String item1 = kb.next();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2:");
		String item2 = kb.next();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3:");
		String item3 = kb.next();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		System.out.println("Please enter item 4:");
		String item4 = kb.next();
		System.out.println("Please enter the price:");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<< Receipt >>>>>>>>>>\n\n");
		
		format(item1,price1);
		format(item2,price2);
		format(item3,price3);
		format(item4,price4);
		format("Subtotal",subtotal);
		format("Discount",discount);
		format("Tax",tax);
		format("Total",total);
		
		System.out.println("\n__________________________________");
		System.out.println("   *Thank you for your support*	");
	}
	
	public static double calcDisc(double subtotal)
	{
		if (subtotal>=2000)
			return subtotal * 0.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("* %15s ........ %10.2f\n",item,price);
	}
}