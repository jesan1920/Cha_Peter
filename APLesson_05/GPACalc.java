import java.util.Scanner;
public class GPACalc
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter first grade:");
		String gr1 = kb.next();
		
		System.out.println("Enter second grade:");
		String gr2 = kb.next();
		
		System.out.println("Enter third grade:");
		String gr3 = kb.next();
		
		System.out.println("Enter fourth grade:");
		String gr4 = kb.next();
		
		System.out.println("Enter fifth grade:");
		String gr5 = kb.next();
		
		System.out.println("Enter sixth grade:");
		String gr6 = kb.next();
		
		System.out.println("Enter seventh grade:");
		String gr7 = kb.next();
		
		double gradePoints = calcPoints(gr1) + calcPoints(gr2) + calcPoints(gr3) + calcPoints(gr4) + calcPoints(gr5) + calcPoints(gr6) +calcPoints(gr7);
		print(gpa(gradePoints));
	}
	
	public static double gpa(double gradePoints)
	{
		return gradePoints/7;
	}
	
	public static double calcPoints(String grade)
	{
		double gradePoints = 0;
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		
		return gradePoints;
	}
	
	public static void print (double gpa)
	{
		System.out.printf("Your GPA is %.1f.",gpa);
	}
}