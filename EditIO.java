package planner;

import java.util.Scanner;

public class EditIO 
{
	/**
	 * Edits the calendar at one point
	 * @param scan the system scanner
	 * @param c the calendar to edit
	 */
	public static void editCalendar(Scanner scan, Calendar c)
	{
		System.out.println("Pick a day to edit");
		System.out.print("Month (number): ");
		int m = scan.nextInt();
		System.out.print("Day (number): ");
		int d = scan.nextInt();
		Day y = c.getDay(m, d);
		System.out.printf("\n\n%s\n",y.toString());
		System.out.println("Which would you like to pick? ");
		int pick = scan.nextInt();
		Event e = y.getEvents().get(pick);
		System.out.printf("[1] Name\t\t\tcurrent name: %s\n"
				+ "[2] Start Time\t\tcurrent start: %d\n"
				+ "[3] End Time\t\tcurrent end: %d\n"
				+ "[4] Description\t\tcurrent description: %s"
				+ "[5] Event Date\t\tcurrent day: %s", 
				e.eventName, e.start, e.end, e.description, y.getDate());
		System.out.println("Which attribute would you like to change?");
		int edit = scan.nextInt();
		switch (edit)
		{
		case 1: editName(scan, y,pick); break;
		case 2: editStart(scan, y,pick); break;
		case 3: editEnd(scan, y,pick); break;
		case 4: editDescription(scan, y,pick); break;
		case 5: editDay(scan, c, m, d ,pick); break;
		default: System.out.println("Invalid input");
		}
		
	}
	/**
	 * Lets user edit the day of an event
	 * @param scan the IO scanner
	 * @param c the calendar that has the event
	 * @param month the old month
	 * @param day the old day
	 * @param pick the event's position in that day
	 */
	private static void editDay(Scanner scan, Calendar c, int month, int day, int pick) {
		// TODO Auto-generated method stub
		System.out.println("Enter the new month (number): ");
		int newM = scan.nextInt();
		System.out.println("Enter the new Day (number): ");
		int newD = scan.nextInt();
		c.editEventDay(month, day, pick, newM, newD);
	}
	/**
	 * lets the user edit the description of an event
	 * @param scan the IO scanner
	 * @param y the day of the event
	 * @param pick the event's position in that day
	 */
	private static void editDescription(Scanner scan, Day y, int pick) 
	{
		System.out.println("Enter the new description: ");
		String newDesc = scan.nextLine();
		y.editEventName(pick, newDesc);
		
	}
	/**
	 * Lets the user edit the end time of an event
	 * @param scan the IO scanner
	 * @param y the day of the event
	 * @param pick the event's position in that day
	 */
	private static void editEnd(Scanner scan, Day y, int pick) {
		System.out.println("Enter the new End time: ");
		int newEnd = scan.nextInt();
		y.editEventEnd(pick, newEnd);
		
	}
	/**
	 * Lets user edit the end time of an event
	 * @param scan the IO scanner
	 * @param y the day of the event
	 * @param pick the event's position in that day
	 */
	private static void editStart(Scanner scan, Day y, int pick) 
	{
		System.out.println("Enter the new Start time: ");
		int newStart = scan.nextInt();
		y.editEventStart(pick, newStart);
		
	}
	/**
	 * Lets user edit the name of an event
	 * @param scan the IO scanner
	 * @param y the day of the event
	 * @param pick the event's position in that day
	 */
	private static void editName(Scanner scan, Day y, int pick)
	{
		System.out.println("Enter the new name: ");
		String newName = scan.nextLine();
		y.editEventName(pick, newName);
	}
}
