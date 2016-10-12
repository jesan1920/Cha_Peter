import java.util.Scanner;
public class Lab_03c
{
	public static void main(String[]args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("What is the radius of the circle?");
		int radius=keyboard.nextInt();
		double circumference=2*3.14*radius;
		System.out.println("The circumference of the circle is "+circumference+".");
	}
}