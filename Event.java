/*
 * Event Class.
 */
package planner;

import java.util.*;

public class Event {

    public String date;
    public int start;
    public int end;
    public String eventName;
    public String description;
    
    /**
     * The full constructor with all possible attributes. 
     */
    Event(String date, int start, int end, String eventName, String description) {
        this.date = date;
        this.start = start;
        this.end = end;
        this.eventName = eventName;
        this.description = description;
    }
    
    /**
     * The constructor without description. 
     */
    Event(String date, int start, int end, String eventName) {
        this.date = date;
        this.start = start;
        this.end = end;
        this.eventName = eventName;
        this.description = "";
    }
    
    /**
     * Empty Constructor.
     */
    Event() {
        
    }
   
}
