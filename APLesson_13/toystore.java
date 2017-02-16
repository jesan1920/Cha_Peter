import java.util.Arrays;
import java.util.ArrayList;

public class toystore
{
	public ArrayList <toy> toyList;
	
	public toystore()
	{
		toyList = new ArrayList<>();
	}
	
	public toystore (String t)
	{
		toyList = new ArrayList<>();
		loadToys(t);
	}
	
	public ArrayList <toy> loadToys (String ts)
	{
		ArrayList <String> toys = new ArrayList <String> (Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			toy newToy = getThatToy(name);
			
			if (newToy == null)
			{
				if(type.equals("Car"))
					toyList.add(new car(name));
				if(type.equals("AF"))
					toyList.add(new afigure(name));
			}
			else
				newToy.setCount(newToy.getCount()+1);
		}
		return toyList;
	}
	
	public toy getThatToy (String nm)
	{
		for(toy t : toyList)
		{
			if(t.getName().equals(nm))
				return t;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(toy t : toyList)
		{
			if(t.getType().equals("Car"))
				cars++;
			if(t.getType().equals("AF"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		if(cars < figures)
			return "Action Figures";
		return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList.toString();
	}
}