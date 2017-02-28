import java.util.Random;

public abstract class ticket
{
	public int serialNo;
	public Random ran = new Random();
	
	public ticket()
	{
		serialNo = ran.nextInt(1000000) + 1000000 * ran.nextInt(10);
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + this.getSerialNo() + "\nPrice: " + this.getPrice();
	}
}