import java.util.Random;

public class Toyota implements Location
{
	private double[] location;
	
	public Toyota(String coordinates)
	{
		double[] loc = new double[2];
		String[] co = coordinates.split(",");
		loc[0] = Double.parseDouble(co[0]);
		loc[1] = Double.parseDouble(co[1]);
		this.location = loc;
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