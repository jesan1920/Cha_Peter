public class gamerunner
{
	public static void main (String args[])
	{
		playstation ps = new playstation("ps");
		System.out.println(ps);
		
		pc pc = new pc("pc");
		System.out.println(pc);
		
		xbox xbox = new xbox("xbox");
		System.out.println(xbox);
	}
}