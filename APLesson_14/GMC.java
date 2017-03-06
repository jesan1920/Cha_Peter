import java.util.Random;

public class GMC implements Location
{
	private int x;
	private int y;
	
	public GMC(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getID()
	{
		Random ran = new Random();
		return ran.nextInt(100000) + 100000 * ran.nextInt(10);
	}
	
	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
}