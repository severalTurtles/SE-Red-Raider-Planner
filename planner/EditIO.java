package planner;


import java.util.InputMismatchException;
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
		Day y = null;
		do
		{
			y = getDay(scan,c);
			if(y != null)
			{
				chooseEvent(scan, c, y);
			}
			
		}
		while(y != null);
	}
	public static Day getDay(Scanner scan, Calendar c)
	{
		boolean continueGet = true;
		Day get = null;
		System.out.println("Get date: (-1 to quit)");
		while(continueGet)
		{
			continueGet = false;
			int m = 13;
			try
			{
				System.out.print("Month (number): ");
				m = scan.nextInt();
				System.out.println(m);
			}
			catch(InputMismatchException exc)
			{
				scan.nextLine();
			}
			if(m < 1)
			{
				return null;
			}
			else if(m > 12)
			{
				System.out.println("Invalid month");
				continueGet = true;
			}
			else
			{
				int d = -1;
				try
				{
					System.out.print("Day (number): ");
					d = scan.nextInt();
				}
				catch(InputMismatchException exc)
				{
					scan.nextLine();
				}
				get = c.getDay(m,d);
				if(get == null)
				{
					System.out.println("Invalid day");
					continueGet = true;
				}
			}	
		}
		return get;
	}
	public static void chooseEvent(Scanner scan, Calendar cal, Day y)
	{
		boolean continueEvent = true;
		while(continueEvent)
		{
			int size = y.getEvents().size();
			System.out.println("Which would you like to pick? (-1 to exit)");
			System.out.printf("\n%s",y.toString());
			System.out.printf("[%d] Pick another day\n", size);
			int pick = -1;
			int edit = -1;
			Event e = null;
			try
			{
				pick = scan.nextInt();
				if(pick >= size)
				{
					continueEvent = false;
				}
				else
				{
					e = y.getEvents().get(pick);
				}
			}
			catch(IndexOutOfBoundsException exc)
			{
				System.out.println("Invalid Input");
				scan.nextLine();
				edit = 0;
			}
			catch(InputMismatchException exc)
			{
				System.out.println("Invalid Input");
				scan.nextLine();
				edit = 0;
			}
			while(edit == -1 && continueEvent == true)
			{
				System.out.printf("[1] Name\t\tcurrent name: %s\n"
						+ "[2] Start Time\t\tcurrent start: %d\n"
						+ "[3] End Time\t\tcurrent end: %d\n"
						+ "[4] Description\t\tcurrent description: %s\n"
						+ "[5] Event Date\t\tcurrent day: %s\n"
						+ "[6] Edit different event\n", 
						e.eventName, e.start, e.end, e.description, y.getDate());
				try
				{
					System.out.println("Which attribute would you like to change?");
					edit = scan.nextInt();
					
				}
				catch(InputMismatchException exc)
				{
					scan.nextLine();
				}
				switch (edit)
				{
				case 1: editName(scan, y,pick); edit = -1; break;
				case 2: editStart(scan, y,pick); edit = -1; break;
				case 3: editEnd(scan, y,pick); edit = -1; break;
				case 4: editDescription(scan, y,pick); edit = -1; break;
				case 5: editDay(scan, cal,y ,pick); 
				System.out.println("Now in " + y.getDate());
				edit = -1; break;
				case 6: edit = 0; break;
				default: System.out.println("Invalid input"); edit = -1; break;
				}
			}
			
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
	private static void editDay(Scanner scan, Calendar c, Day oldDay, int pick) {
		// TODO Auto-generated method stub
		Day newDay = getDay(scan,c);
		c.editEventDay(oldDay.getMonth(), oldDay.getDay(), pick, newDay.getMonth(), newDay.getDay());
	}
	/**
	 * lets the user edit the description of an event
	 * @param scan the IO scanner
	 * @param y the day of the event
	 * @param pick the event's position in that day
	 */
	private static void editDescription(Scanner scan, Day y, int pick) 
	{
		System.out.println("Enter the new description: \n");
		scan.nextLine();
		String newDesc = scan.nextLine();
		y.editEventDesc(pick, newDesc);
		
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
		scan.nextLine();
		String newName = scan.nextLine();
		y.editEventName(pick, newName);
	}
}//
