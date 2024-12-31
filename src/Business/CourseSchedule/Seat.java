/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseSchedule;

/**
 *
 * @author HP
 */
public class Seat {
    
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment;
    CourseOffer courseoffer;
    
    public Seat (CourseOffer co, int n) {
        courseoffer = co;
        number = n;
        occupied = false;
    }
    
    public Boolean isOccupied() {
        return occupied;
    }
    
    public SeatAssignment newSeatAssignment(CourseLoad cl) {
        seatassignment = new SeatAssignment(cl, this);
        occupied = true;
        return seatassignment;
    }
    
    public CourseOffer getCourseOffer() {
        return courseoffer;
    }
    
    public int getCourseCredits() {
        return courseoffer.getCreditHours();
    }
            
    
}
