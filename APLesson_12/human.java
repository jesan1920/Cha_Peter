import java.util.Scanner;
public class human
{
	private String hair, eyes, skin;
	
	public human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public human(String h, String e, String s)
	{
		
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setValues(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input your hair color:");
		String hair = kb.next();
		System.out.println("Please input your eye color:");
		String eyes = kb.next();
		System.out.println("Please input your skin color:");
		String skin = kb.next();
		
		human object = new human(hair, eyes, skin);
		System.out.printf("My info...\nHair:\t%s\nEyes:\t%s\nSkin:\t%s",object.getHair(),object.getEyes(),object.getSkin());
		
		object.setValues("blonde", "blue", "white");
		System.out.printf("\n\nFriend's info...\nHair:\t%s\nEyes:\t%s\nSkin:\t%s",object.getHair(),object.getEyes(),object.getSkin());
	}
}