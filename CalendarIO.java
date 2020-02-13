package planner;

import java.util.Scanner;

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
				Day d = c.getDay(i, j);
				for(List<Event> e: d.getEvents()) {
					System.out.println(e);
				}
			}
		}
		
	}

}