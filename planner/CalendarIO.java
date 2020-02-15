package planner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class CalendarIO {

	public static void viewCalendar(Scanner s, Calendar c) {
		
		int days = 0;
		
		for(int i = 1; i <= 12; i++) {
			switch(i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days = 31;
					break;
				case 2:
					days = 29;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					days = 30;
					break;
			}
			
			for(int j = 1; j <= days; j++) {
				try {
					Day d = c.getDay(i, j);
					for(Event e: d.getEvents()) {
						System.out.println(e);
					}
				} catch(Exception e) {
					//
				}
			}
		}
		
	}

	public static void viewWeek(Scanner s, Calendar c) {
		System.out.println("Enter a start date to display the week's events.");
		System.out.print("Month (1-12):");
		int startMonth = s.nextInt();
		System.out.print("Day (0-31):");
		int startDay = s.nextInt();

		int overflowDay = 1;
		Map<Integer, Integer> month_days = new HashMap<Integer,Integer>();
		month_days.put(1,31);
		month_days.put(2,29);
		month_days.put(3,31);
		month_days.put(4,30);
		month_days.put(5,31);
		month_days.put(6,30);
		month_days.put(7,31);
		month_days.put(8,31);
		month_days.put(9,30);
		month_days.put(10,31);
		month_days.put(11,30);
		month_days.put(12,31);

		for(int i = 0; i < 7; i++) {
			// if the day to be displayed has yet to flow into the next month
			if(startDay + i <= (int)month_days.get(startMonth)) {
				
				try {
					Day d = c.getDay(startMonth, startDay + i);
					// print the day's events
					for(Event e: d.getEvents()) {
						System.out.println("Events for " + startMonth + "/" + (startDay+i));
						System.out.println(e);
					}
				} catch(Exception e) {
					//
				}

			}
			// if the day to display has gone to the next month, but not the next year
			else if (startMonth + 1 <= 12) {
				Day d = c.getDay(startMonth + 1, overflowDay);
				// print the day's events
				for(Event e: d.getEvents()) {
					System.out.println("Events for " + (startMonth+1) + "/" + (overflowDay));
					System.out.println(e);
				}
				overflowDay++;
			}
		}

	}

}