package planner;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class Calender 
{
	Map <String, List> year;
	public Calender()
	{
		//assume 2020ce
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
				if(i < 30)
				{
					feb.add(new Day(i));
				}
				apr.add(new Day(i));
				jun.add(new Day(i));
				sep.add(new Day(i));
				nov.add(new Day(i));
			}
			jan.add(new Day(i));
			mar.add(new Day(i));
			may.add(new Day(i));
			jul.add(new Day(i));
			aug.add(new Day(i));
			oct.add(new Day(i));
			dec.add(new Day(i));
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
}
