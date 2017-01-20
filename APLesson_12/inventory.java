import java.util.Scanner;
public class inventory
{
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private int price;
	
	public inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public inventory (String m, String n)
	{
		manufacturer = m;
		name = n;
		UPC = (int)(Math.random() * 1000000000) + 1;
		category = "storage";
		price = 300;
	}
	
	public inventory (String m, String n, String c, int p)
	{
		manufacturer = m;
		name = n;
		UPC = (int)(Math.random() * 1000000000) + 1;
		category = c;
		price = p;
	}
	
	public String toString()
	{
		return "Item Info...\nManufacturer: " + manufacturer + "\nName: " + name + "\nCategory: " + category + "\n9-digit UPC#: " + UPC + "\nPrice: $" + price;
	}
	
	public static void main (String[]args)
	{
		inventory item1;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input the manufacturer:");
		String manufacturer = kb.next();
		System.out.println("Please input your item name:");
		String name = kb.next();
		System.out.println("Would you like to input category and price information? (y or n) ");
		String yesNo = kb.next();
		
		if (yesNo.equals("n"))
		{
			item1 = new inventory(manufacturer, name);
			System.out.println(item1);
		}
		
		if (yesNo.equals("y"))
		{
			System.out.println("Please input the category:");
			String category = kb.next();
			System.out.println("Please input the price:");
			int price = kb.nextInt();
			item1 = new inventory(manufacturer, name, category, price);
			System.out.println(item1);
		}
	}
}