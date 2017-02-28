public class ticketdriver
{
	public static void main (String args[])
	{
		ticket a = new advance(0);
		System.out.println(a);
		
		ticket sa = new studentAdvance(0);
		System.out.println(sa);
		
		ticket w = new walkup();
		System.out.println(w);
	}
}