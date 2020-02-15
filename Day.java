package planner;

import java.util.ArrayList;
import java.util.List;

public class Day 
{
	private String date;
	private List<Event> events;
	//new Event 
	/**
	 * Creates a new Day object with a day, month, and year
	 * @param day the day of the month [1,31]
	 * @param month the month of the year [1,12]
	 * @param year the year [2020]
	 */
	public Day(int day, int month, int year)
	{
		String d = String.format("%2d", day);
		String m = String.format("%2d", month);
		String y = String.format("%4d", year);
		date = d + "/" + m + "/" + y;
		events = new ArrayList<Event>();
	}
	/**
	 * @return dd/mm/yyyy
	 */
	public String getDate()
	{
		return date;
	}
	
	public int getMonth()
	{
		String partial = date.substring(0,2);
		partial = partial.trim();
		return Integer.parseInt(partial);
	}
	
	public int getDay()
	{
		String partial = date.substring(3,5);
		partial = partial.trim();
		return Integer.parseInt(partial);
	}
	
	/**
	 * Asks user for information to add an event to this day
	 */
	public void addEvent(Event adder)
	{
		events.add(adder);
	}
	
	public void addEvent(int start, int end, String name, String desc)
	{
		Event adder = new Event(start, end,  name, desc);
		events.add(adder);
	}
	/**
	 * Asks user for information to edit an event
	 * @param index which event to edit
	 */
	public void editEventName(int index, String n)
	{
		Event e = events.get(index);
		e.editName(n);
	}
	
	public void editEventStart(int index, int s)
	{
		Event e = events.get(index);
		e.editStartTime(s);
	}
	
	public void editEventEnd(int index, int n)
	{
		Event e = events.get(index);
		e.editEndTime(n);
	}
	
	public void editEventDesc(int index, String d)
	{
		Event e = events.get(index);
		e.editDescription(d);
	}
	/**
	 * Removes an event from the list
	 * @param index which event to remove
	 */
	public void deleteEvent(int index)
	{
		events.remove(index);
	}
	
	public List<Event> getEvents()
	{
		return events;
	}
	
	
	/**
	 * Returns "Events for dd/mm/yyyy" then a list of all the events
	 */
	public String toString()
	{
		String today = "Events for " + date +" :\n";
		for(int i = 0; i < events.size(); i++)
		{
			today += "[" + i + "]" + "\t" + events.get(i).toString() + "\n";
		}
		return today;
	}
}
