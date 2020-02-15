package planner;

import java.util.Scanner;

public class addIO 
{
	/** author cenright
	 * add an event to a day
	 * @param scan the system scanner
	 * @param c the calendar to edit
	 */
	public static void addEvent(Scanner scan, Calendar c)
	{
		System.out.println("\nNew Event Creation:  \nWhat Day is your event?");
		System.out.print("Month (number): ");
		int m = scan.nextInt();
		System.out.print("Day (number): ");
		int d = scan.nextInt();
		scan.nextLine();
		Day y = c.getDay(m, d);
		System.out.println("Enter Event Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Event Description: ");
		String desc = scan.nextLine();
		System.out.println("Enter Event Start Time (integer):");
		int strt = scan.nextInt();
		System.out.println("Enter Event Stop Time (integer):");
		int stp = scan.nextInt();
		y.addEvent(strt,stp,name,desc);
		System.out.println("Event Successfully Added! \n");
	}}
		
