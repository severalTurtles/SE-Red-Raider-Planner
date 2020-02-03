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
    Event() {}
    
    
    /**
     * This function adds event attributes to event instance.
     * 
     * @pre The Event class was initialized empty.
     */
    public void addEvent(String date, int start, int end, String eventName, String description) {
        this.date = date;
        this.start = start;
        this.end = end;
        this.eventName = eventName;
        this.description = description;
    }
    
    public void addEvent(String date, int start, int end, String eventName) {
        this.date = date;
        this.start = start;
        this.end = end;
        this.eventName = eventName;
    }
    
    /**
     * This function takes a string input of what is being edited and
     * edits the appropriate attribute with newAttributeValue. If no matching attribute then 
     * 0 is returned for failure.
     * 
     * @param <T> The type of the attribute to edit.
     * @param attributeToEdit The attribute to edit.
     * @param newAttributeValue The value to edit attribute with.
     * @return 1 for success, 0 for failure.
     */
    public <T> int editEvent(String attributeToEdit, T newAttributeValue) {
        switch (attributeToEdit) {
            case "date":
                this.date = (String) newAttributeValue;
                break;
            case "start":
                this.start = (Integer) newAttributeValue;
                break;
            case "end":
                this.end = (Integer) newAttributeValue;
                break;
            case "eventName":
                this.eventName = (String) newAttributeValue;
                break;
            case "description": 
                this.description = (String) newAttributeValue;
            default:
                return 0;
        }
        
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
