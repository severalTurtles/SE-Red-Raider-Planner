package planner;

public class Day {
	private String date;
	public Day(int day, int month, int year)
	{
		String d = String.format("%2d", day);
		String m = String.format("%2d", month);
		String y = String.format("%4d", year);
		date = d + "/" + m + "/" + y;
	}
	
	public String toString()
	{
		return date;
	}
}

