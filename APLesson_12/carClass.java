import java.util.Scanner;
public class carClass
{
	private String p, i, e, t;
	
	public carClass()
	{
		p = "";
		i = "";
		e = "";
		t = "";
	}
	
	public carClass(String paint, String interior, String engine, String tires)
	{
		p = paint;
		i = interior;
		e = engine;
		t = tires;
	}
	
	public void setValues(String paint, String interior, String engine, String tires)
	{
		p = paint;
		i = interior;
		e = engine;
		t = tires;
	}
	
	
	
	public String getPaint()
	{
		return p;
	}
	
	public String getInterior()
	{
		return i;
	}
	
	public String getEngine()
	{
		return e;
	}
	
	public String getTires()
	{
		return t;
	}
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input the paint color:");
		String p = kb.nextLine();
		System.out.println("Please input the interior type:");
		String i = kb.nextLine();
		System.out.println("Please input the engine type:");
		String e = kb.nextLine();
		System.out.println("Please input the tire type:");
		String t = kb.nextLine();
		
		carClass object = new carClass(p, i, e, t);
		System.out.printf("Your vehicle is ready......\nPaint:\t%s\nInterior:\t%s\nEngine:\t%s\nTires:\t%s", object.getPaint(), object.getInterior(), object.getEngine(), object.getTires());
	}
}