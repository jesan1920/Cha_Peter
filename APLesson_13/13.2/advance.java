public class advance extends ticket
{
	private int daysLeft;
	
	public advance(int d)
	{
		super();
		daysLeft = d;
	}
	
	public int getPrice()
	{
		if(daysLeft >= 10)
			return 30;
		else
			return 40;
	}
}