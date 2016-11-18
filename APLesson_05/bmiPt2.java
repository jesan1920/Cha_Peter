import java.util.Scanner;
public class bmiPt2
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Enter weight in pounds:");
		double weight = kb.nextDouble();
		
		System.out.println("Enter height in inches:");
		double height = kb.nextDouble();
		
		double bmi = weight/Math.pow(height,2)*703.0704;
		print(bmi, calcCondish(bmi));
	}
	
	public static String calcCondish(double bmi)
	{
		String rating = "rating";
		if (bmi > 39.9)
			return "morbidly_obese";
		else if (bmi >= 35)
			return "very_obese";
		else if (bmi >= 29.9)
			return "obese";
		else if (bmi >= 25)
			return "overweight";
		else if (bmi >= 18.5)
			return "normal";
		if (bmi > 18.5)
			return "underweight";
		
		return rating;
	}
	
	public static void print (double bmi, String rating)
	{
		System.out.printf("Your BMI is %.1f.\nYou are %s.",bmi,rating);
	}
}