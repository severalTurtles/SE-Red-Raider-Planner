package planner;

import java.awt.Event;
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
		events = new List<Event>();
	}
	/**
	 * @return "dd/mm/yyyy"
	 */
	public String getDate()
	{
		return date;
	}
	/**
	 * Asks user for information to add an event to this day
	 */
	public void addEvent()
	{
		String name = ""; //take input
		int start = -1; //take input
		int finish = -1; //take input
		String desc = ""; //take input
		Event adder = new Event(start, finish, name, desc);
		events.add(adder);
	}
	/**
	 * Asks user for information to edit an event
	 * @param index which event to edit
	 */
	public void editEvent(int index)
	{
		Event e = events.get(i);
		//ask edit name
		e.editName("");
		//ask edit start time
		e.editStart(-1);
		//ask edit end time
		e.editEnd(-1);
		//ask edit description
		e.editDescription("");
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
	 * Returns "Events for dd/mm/yyyy" then a list of all the events
	 */
	public String toString()
	{
		String today = "Events for " + date +" :\n";
		for(int i = 0; i < events.size(); i++)
		{
			today += events.get(i).toString() + "\n";
		}
		return today;
	}
}

