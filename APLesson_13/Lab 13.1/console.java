public abstract class console extends gamesystem
{
	public console()
	{
		super();
	}
	
	public console(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " +this.getPlatform() + "\nSerial #: " + this.getSerialNo() + "\nController: " + this.getController();
	}
}