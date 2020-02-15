package planner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RPPlanerIO 
{
	Scanner scan;
	Calendar cal;
	public RPPlanerIO(Scanner s, Calendar c)
	{
		scan = s;
		cal = c;
	}
	
	public void run()
	{
		boolean goOn = true;
		while(goOn)
		{
			System.out.println("What would you like to do?");
			System.out.println("[1] Add event");
			System.out.println("[2] Edit event");
			System.out.println("[3] Delete event");
			System.out.println("[4] Show this week's events");
			System.out.println("[5] Show Calendar");
			System.out.println("[6] Exit");
			int inputA = -1;
			try
			{
				inputA = scan.nextInt();
			}
			catch(InputMismatchException exc)
			{
				scan.nextLine();
			}
			switch(inputA)
			{
			case 1: addIO.addEvent(scan,cal); break;
			case 2: EditIO.editCalendar(scan,cal); break;
			case 3: RemoveIO.removeEvent(scan,cal); break;
			case 4: CalendarIO.viewWeek(scan,cal); break;
			case 5: CalendarIO.viewCalendar(scan,cal); break;
			case 6: goOn = false; break;
			default: System.out.println("invalid input");
			}
		}
		
	}
}
