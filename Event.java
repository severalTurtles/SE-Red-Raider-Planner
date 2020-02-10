/*
 * Event Class.
 */
package planner;

import java.util.*;

public class Event {

    public int start;
    public int end;
    public String eventName;
    public String description;
    
    /**
     * The full constructor with all possible attributes. 
     */
    Event(int start, int end, String eventName, String description) {
        this.start = start;
        this.end = end;
        this.eventName = eventName;
        this.description = description;
    }
    
    /**
     * The constructor without description. 
     */
    Event(int start, int end, String eventName) {
        this.start = start;
        this.end = end;
        this.eventName = eventName;
        this.description = "";
    }
    
    public int editStartTime(int newStart)
    {
    	start = newStart;
    	//return 0 if invalid start time
    	return 1;
    }
    
    public int editEndTime(int newEnd)
    {
    	end = newEnd;
    	//return 0 if invalid end time
    	return 1;
    }
    
    public int editName(String newName)
    {
    	eventName = newName;
    	return 1;
    }
    
    public int editDescription(String newDescription)
    {
    	description = newDescription;
    	return 1;
    }
    
    /*
    public static void main(String args[]) {
        
        // Testing addEvent function
        Event testEvent1 = new Event();
        testEvent1.addEvent("1900/22/11", 2, 8, "Wedding", "A old wedding in 1900");
        
        System.out.println(testEvent1.date);
        System.out.println(testEvent1.start);
        System.out.println(testEvent1.end);
        System.out.println(testEvent1.eventName);
        System.out.println(testEvent1.description);
        System.out.println();
        
        // Testing editEvent function
        Event testEvent2 = new Event("1998/20/12", 2, 4, "Classy Event", "blah blah blah");       
        testEvent2.editEvent("date", "1998/20/08");
        testEvent2.editEvent("description", "New description");
        
        System.out.println(testEvent2.date);
        System.out.println(testEvent2.description);
        
    }
    */

}
