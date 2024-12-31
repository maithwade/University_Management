/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseSchedule;

import Business.CourseCatalog.Course;
import Business.CourseCatalog.CourseCatalog;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CourseSchedule {
    
    CourseCatalog coursecatalog;
    
    ArrayList<CourseOffer> schedule;
    String semester;
    
    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList();
    }
    
    public CourseOffer newCourseOffer(String n) {
        
        Course c = coursecatalog.getCourseByNumber(n);
        if(c==null) return null;
        CourseOffer co;
        co = new CourseOffer(c);
        schedule.add(co);
        return co;
    }

//    public ArrayList<CourseOffer> getSchedule() {
//        return schedule;
//    }

    public ArrayList<CourseOffer> getSchedule() {
        return schedule;
    }
    
    
    
    
    
    public CourseOffer getCourseOfferByNumber(String n) {
        
        for(CourseOffer co : schedule) {
            if (co. getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }
    
    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co: schedule) {
            
            sum = sum + co.getTotalCourseRevenues();
            
        }
        return sum;
    }
    
    public void printSchedule() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
    
        int tableWidth = 15 + 50 + 30 + 20 + 20 + 20 + 20 + 20 + 20 + 9*3; // sum of all column widths + 3 spaces for each '|'
        String title = "Schedule for Semester: " + semester;
        int paddingSize = (tableWidth - title.length()) / 2; // calculate the padding size
        String format = "%" + paddingSize + "s%s%" + paddingSize + "s\n"; // create a format string
        System.out.printf(ANSI_GREEN + format + ANSI_RESET, "", title, ""); // print the title centered in green
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
        System.out.printf("| %-15s | %-50s | %-30s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s |\n", "Course Number", "Course Name", "Faculty", "Faculty ID", "Total Class Size", "Registered Students", "Empty Seats", "Course Price", "Total Revenues");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    
        for (CourseOffer co : schedule) {
            System.out.printf("| %-15s | %-50s | %-30s | %-20s | %-20d | %-20d | %-20d | $%-19d | $%-19d |\n", 
                co.getCourseNumber(), 
                co.getCourseName(), 
                co.getFacultyName(), 
                co.getFacultyID(), // assuming the CourseOffer class has a getFacultyId() method
                co.getSeatList().size(), 
                co.getNumberOfStudents(), 
                (co.getSeatList().size() - co.getNumberOfStudents()), 
                co.getCoursePrice(), 
                co.getTotalCourseRevenues());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    }
    
    
}
