/**
 * 
 */
package planner;

import java.util.Scanner;

/**
 * @author tfure
 *
 */
public class RRPrunner {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar(2020);
		Day t1 = cal.getDay(1, 30);
		Day t2 = cal.getDay(1, 29);
		Day t3 = cal.getDay(2, 1);
		Day t4 = cal.getDay(2, 29);
		t1.addEvent(0, 30, "event1", "Happy new year");
		t1.addEvent(100, 1200, "event2", "I'm going back to bed");
		t1.addEvent(1200, 1800, "event3", "Oh no gotta deal with guests");
		t2.addEvent(0, 2359, "event4", "Happy Birthday James");
		t3.addEvent(1600, 2000, "event5", "I hope Mahomes wins the Super Bowl");
		t4.addEvent(800, 2000, "event6", "Wait it isn't March?");
		RPPlanerIO runner = new RPPlanerIO(scan,cal);
		runner.run();	
	}
}

