public class studentAdvance extends advance
{
	public studentAdvance(int d)
	{
		super(d);
	}
	
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: " + this.getSerialNo() + "\nPrice: " + this.getPrice() + "\n(STUDENT ID REQUIRED)";
	}
}