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
	 * @return mm/dd/yyyy
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
	/**
	 * adds an event to this day given event parameters
	 * @param start the event's start time
	 * @param end the event's end time
	 * @param name the event's name
	 * @param desc a description for the event
	 */
	public void addEvent(int start, int end, String name, String desc)
	{
		Event adder = new Event(start, end,  name, desc);
		events.add(adder);
	}
	/**
	 * Edits the name of the chosen event
	 * @param index the event to edit
	 * @param n the new name
	 */
	public void editEventName(int index, String n)
	{
		Event e = events.get(index);
		e.editName(n);
	}
	/**
	 * Edits the start time of the chosen event
	 * @param index the event to edit
	 * @param s the new start time
	 */
	public void editEventStart(int index, int s)
	{
		Event e = events.get(index);
		e.editStartTime(s);
	}
	/**
	 * Edits the end time of the chosen event
	 * @param index the event to edit
	 * @param n the new end time
	 */
	public void editEventEnd(int index, int n)
	{
		Event e = events.get(index);
		e.editEndTime(n);
	}
	/** 
	 * Edits the description of the chosen event
	 * @param index the event to edit
	 * @param d the new description
	 */
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
	/**
	 * @return the list of events on this day
	 */
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


