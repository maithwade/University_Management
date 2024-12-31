/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.CourseSchedule.CourseOffer;

/**
 *
 * @author HP
 */
public class FacultyAssignment {
    
    double tracerating;
    CourseOffer courseoffer;
    FacultyProfile facultyprofile;
    
    public FacultyAssignment(FacultyProfile fp, CourseOffer co) {
        courseoffer= co;
        facultyprofile = fp;
    }
    
    public double getRating() {
        return tracerating;
    }
    
    public void setProfRating(double r) {
        tracerating = r;
    }
    
    public FacultyProfile getFacultyProfile() {
        return facultyprofile;
    }
    
}
