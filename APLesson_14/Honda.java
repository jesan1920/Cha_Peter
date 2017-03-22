import java.util.Random;

public class Honda implements Location
{
	private double[] location;
	
	public Honda(double[] location)
	{
		this.location = location;
	}
	
	public int getID()
	{
		Random ran = new Random();
		return ran.nextInt(100000) + 100000 * ran.nextInt(10);
	}
	
	public void move(int x, int y)
	{
		location[0] = x;
		location[1] = y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}