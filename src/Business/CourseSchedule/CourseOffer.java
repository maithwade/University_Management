/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseSchedule;

import Business.CourseCatalog.Course;
import Business.Profiles.FacultyAssignment;
import Business.Profiles.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CourseOffer {
    
    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;
    String facultyName;
    
    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
        //facultyName = "No Faculty Assigned Yet";
    }
    
    public void AssignAsTeacher(FacultyProfile fp){
        facultyassignment = new FacultyAssignment(fp, this);
        //facultyName = fp.getPerson().getName();
    }
    
    public FacultyProfile getFacultyProfile() {
        return facultyassignment.getFacultyProfile();
    }
    
    public String getCourseNumber() {
        return course.getCourseNumber();
    }
    
    public void generateSeats(int n){
        for(int i = 0; i < n; i++) {
            seatlist.add(new Seat(this, i));
        }
    }
    
    public Seat getEmptySeat() {
        for(Seat s: seatlist) {
            if(!s.isOccupied()){
                return s;
            }
        }
        return null;
    }
    
    public SeatAssignment assignEmptySeat(CourseLoad cl) {
        
        Seat seat = getEmptySeat();
        if(seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(cl);
        cl.registerStudent(sa);
        return sa;
    }
    
    public int getTotalCourseRevenues() {
        int sum = 0;
        
        for(Seat s : seatlist) {
            if(s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }
        }
        return sum;
    }
    
    public Course getSubjectCourse() {
        return course;
    }
    
    public int getCreditHours() {
        return course.getCredits();
    }
    
    public String getCourseName() {
        return course.getName();
    }
    
    public String getFacultyName() {
        if(this.facultyassignment != null) {
            return this.facultyassignment.getFacultyProfile().getPerson().getName();
        } else {
            return "No Faculty Assigned Yet.";
        }
    }
    
    public int getFacultyID() {
        if (this.facultyassignment != null) {
            return Integer.parseInt(this.facultyassignment.getFacultyProfile().getPerson().getPersonId());
        } else {
            return 0;
        }
    }
    
    public ArrayList<Seat> getSeatList() {
        return seatlist;
    }
    
    public int getNumberOfStudents() {
        int count = 0;
        for(Seat s : seatlist) {
            if(s.isOccupied()) {
                count++;
            }
        }
        return count;
    }
    
    public int getCoursePrice() {
        return course.getCoursePrice();
    }
}
