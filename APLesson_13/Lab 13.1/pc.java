public class pc extends gamesystem
{
	public pc()
	{
		super();
	}
	
	public pc(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String getPlatform()
	{
		return "PC";
	}
	
	public String toString()
	{
		return "Platform: " + this.getPlatform() + "\nSerial #: " + this.getSerialNo() + "\nSystem Input: " + this.systemInput();
	}
}