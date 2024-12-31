/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseSchedule;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CourseLoad {
    
    String semester;
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String s) {
        seatassignments = new ArrayList();
        semester = s;
    }
    
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat();
        if(seat == null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa); //add to students course
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
        
    }
    
    public float getSemesterScore() {
        float sum = 0;
        for(SeatAssignment sa: seatassignments){
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    }
    
    public ArrayList<SeatAssignment> getSeatAssignments() {
        return seatassignments;
    }
    
}
