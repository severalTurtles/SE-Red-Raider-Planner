package planner;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class Calendar 
{
	private Map <String, List> year;
	public Calendar(int y)
	{
		y = 2020; //assume 2020ce
		year = new HashMap<String, List>();
		List<Day> jan = new ArrayList<Day>();
		List<Day> feb = new ArrayList<Day>();
		List<Day> mar = new ArrayList<Day>();
		List<Day> apr = new ArrayList<Day>();
		List<Day> may = new ArrayList<Day>();
		List<Day> jun = new ArrayList<Day>();
		List<Day> jul = new ArrayList<Day>();
		List<Day> aug = new ArrayList<Day>();
		List<Day> sep = new ArrayList<Day>();
		List<Day> oct = new ArrayList<Day>();
		List<Day> nov = new ArrayList<Day>();
		List<Day> dec = new ArrayList<Day>();
		for(int i = 1; i <= 31; i++)
		{
			if(i < 31)
			{
				if(februaryAdd(y))
				{
					feb.add(new Day(2,i,y));
				}
				apr.add(new Day(4,i,y));
				jun.add(new Day(6,i,y));
				sep.add(new Day(9,i,y));
				nov.add(new Day(11,i,y));
			}
			jan.add(new Day(1,i,y));
			mar.add(new Day(3,i,y));
			may.add(new Day(5,i,y));
			jul.add(new Day(7,i,y));
			aug.add(new Day(8,i,y));
			oct.add(new Day(10,i,y));
			dec.add(new Day(12,i,y));
		}
		year.put("January", jan);
		year.put("February",feb);
		year.put("March", mar);
		year.put("April", apr);
		year.put("May", may);
		year.put("June", jun);
		year.put("July", jul);
		year.put("August", aug);
		year.put("September", sep);
		year.put("October", oct);
		year.put("November", nov);
		year.put("December", dec);
	}
	
	private boolean februaryAdd(int y)
	{
		if(y % 4 == 0)
		{
			if (y % 100 == 0)
			{
				if(y % 400 == 0)
				{
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
}

