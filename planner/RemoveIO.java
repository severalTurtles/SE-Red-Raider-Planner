/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner;

// If invalid parameter exception for event class 

import java.util.Scanner;
/**
 *
 */
public class RemoveIO {
    public static void removeEvent(Scanner scan, Calendar c) {
        /* Choose day to delete */
        System.out.println("Pick a day to edit");
        System.out.print("Month (number): ");
        int m = scan.nextInt();
        System.out.print("Day (number): ");
        int d = scan.nextInt();
        Day day = c.getDay(m, d);
            
        /* ADDING TWO TEST EVENTS (uncomment to test) */
       // day.addEvent(2, 4, "Event number 1", "Hellllllll yeah");
        //day.addEvent(2, 4, "Event number 2", "Hellllllll nah");
        
        /* Print out events on this date */
        System.out.println(day);
        
        /* Choose event */
        int pick = 0;
        System.out.println("Which would you like to pick? (-1) to escape");
         pick = scan.nextInt();
        if (pick!=-1)
        {
        /* Make sure they want to delete this event (later functionality) */
        //Event e = day.getEvents().get(pick);
        //System.out.println("Are you sure you would like to delete: " + e);
        
        day.deleteEvent(pick);}
        System.out.println("Events afters deletion: \n\n" + day);
    }
    
    /*public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int year = 2020;
        Calendar c = new Calendar(year);
        
        removeEvent(scan, c);
        

        

    }*/
    
}
