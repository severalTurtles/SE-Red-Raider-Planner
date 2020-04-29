package planner;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class Calendar 
{
        // SINGLETON PATTERN
    
        //create an object of Calendar
        private static Calendar instance = new Calendar();

        //make the constructor private so that this class cannot be
        //instantiated
        private Calendar() {
            		int y = 2020; //assume 2020ce
		year = new HashMap<String, List<Day>>();
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
		year.put(MONTHS[0], jan);
		year.put(MONTHS[1],feb);
		year.put(MONTHS[2], mar);
		year.put(MONTHS[3], apr);
		year.put(MONTHS[4], may);
		year.put(MONTHS[5], jun);
		year.put(MONTHS[6], jul);
		year.put(MONTHS[7], aug);
		year.put(MONTHS[8], sep);
		year.put(MONTHS[9], oct);
		year.put(MONTHS[10], nov);
		year.put(MONTHS[11], dec);
        }

        //Get the only object available
        public static Calendar getInstance(){
           return instance;
        }
        
	private final String[] MONTHS = {"January","February","March","April",
									"May","June","July","August",
									"September","October","November","December"};
	private Map <String, List<Day>> year;
	
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
	
	public Day getDay(int month, int day)
	{
		if(month > 11 || month < 0)
		{
			return null;
		}
		Day d;
		try
		{
			d = year.get(MONTHS[month-1]).get(day);
		}
		catch(IndexOutOfBoundsException i)
		{
			return null;
		}
		return d;
	}
	
	public int editEventDay(int oldM, int oldD, int event, int newM, int newD)
	{
		Day remove = getDay(oldM, oldD);
		Day adder = getDay(newM, newD);
		List<Event> l = remove.getEvents();
		Event e = l.get(event);
		remove.deleteEvent(event);
		adder.addEvent(e);
		return 1;
	}
}
