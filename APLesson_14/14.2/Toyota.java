public class Toyota extends Car
{
	public Toyota(String coordinates)
	{
		super();
		double[] loc = new double[2];
		String[] co = coordinates.split(",");
		loc[0] = Double.parseDouble(co[0]);
		loc[1] = Double.parseDouble(co[1]);
		this.location = loc;
	}
}