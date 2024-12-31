/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseSchedule;

import Business.CourseCatalog.Course;

/**
 *
 * @author HP
 */
public class SeatAssignment {
    float grade;
    Seat seat;
    boolean like;
    CourseLoad courseload;
    
    public SeatAssignment(CourseLoad cl, Seat s) {
        seat = s;
        courseload = cl;
    }
    
    public boolean getLike() {
        return like;
    }
    
    public void assignSeatToStudent(CourseLoad cl) {
        courseload = cl;
    }
    
    public int getCreditHours() {
        return seat.getCourseCredits();
    }
    
    public Seat getSeat() {
        return seat;
    }
    
    public CourseOffer getCourseOffer() {
        return seat.getCourseOffer();
    }
    
    public Course getAssociatedCourse() {
        return getCourseOffer().getSubjectCourse();
    }
    
    public float GetCourseStudentScore() {
        return getCreditHours() * grade;
    }
    
    public float getGrade() {
        return grade;
    }
    
    public void setGrade(float grade) {
        this.grade = grade;
    }
}
