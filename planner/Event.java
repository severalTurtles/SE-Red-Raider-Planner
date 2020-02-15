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
    
   /**
     * Returns s string describing this event
     * [eventName]
     * Starts at: [start time]
     * Ends at: [end time]
     * Event description: [description
     */
    public String toString()
    {
    	String total = "\t";
    	total += eventName + "\n\t";
    	total += "Starts at: " + start + "\n\t";
    	total += "Ends at  : " + end + "\n\t";
    	total += "Event description: " + description + "\n";
    	return total;
    }

}
