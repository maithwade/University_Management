/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Department;

import Business.CourseCatalog.Course;
import Business.CourseCatalog.CourseCatalog;
import Business.CourseSchedule.CourseLoad;
import Business.CourseSchedule.CourseOffer;
import Business.CourseSchedule.CourseSchedule;
import Business.CourseSchedule.SeatAssignment;
import Business.Degree.Degree;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import Business.Profiles.Transcript;
import java.util.HashMap;

/**
 *
 * @author HP
 */
public class Department {
    
    String name;
    
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    
    EmployeeDirectory employeedirectory;
    Degree degree;
    
    HashMap<String, CourseSchedule> mastercoursecatalog;
    
    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory();
        persondirectory = new PersonDirectory();
        degree = new Degree("MSIS");
    }
    
    public void addCoreCourse(Course c) {
        degree.addCoreCourse(c);
    }
    
    public void addElectiveCourse(Course c) {
        degree.addElectiveCourse(c);
    }
    
    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }
    
    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }
    
    public CourseSchedule newCourseSchedule(String semester) {
        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }
    
    public CourseSchedule getCourseSchedule(String semester) {
        return mastercoursecatalog.get(semester);
    }
    
    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }
    
    public Course newCourse(String n, String nm, int cr) {
        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }
    
    public int calculateRevenuesBySemester(String semester){
        CourseSchedule css = mastercoursecatalog.get(semester);
        return css.calculateTotalRevenues();
    }
    
    public void RegisterForAClass(String studentid, String cn, String semester) {
        
        StudentProfile sp = studentdirectory.findStudent(studentid);
        CourseLoad cl = sp.getCurrentCourseLoad();
        CourseSchedule cs = mastercoursecatalog.get(semester);
        CourseOffer co = cs.getCourseOfferByNumber(cn);
        co.assignEmptySeat(cl);
    }
    
    public FacultyDirectory getFacultyDirectory() {
        return facultydirectory;
    }
    
    public void setFacultyDirectory(FacultyDirectory facultydirectory) {
        this.facultydirectory = facultydirectory;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int calculateTuitionFeesForSemester(StudentProfile student, String semester) {
        int total = 0;
        
        Transcript transcript = student.getTranscript();
        CourseLoad courseload = transcript.getCourseLoadBySemester(semester);
        
        if(courseload != null) {
            for (SeatAssignment sa : courseload.getSeatAssignments()) {
                CourseOffer courseOffer = sa.getSeat().getCourseOffer();
                Course course = courseOffer.getSubjectCourse();
                int credits = course.getCredits();

                int tuitionPerCredit = course.getPrice();
                total += credits * tuitionPerCredit;
            }
        }
        return total;
    }
}
