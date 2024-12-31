/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.CourseCatalog.CourseCatalog;
import Business.CourseSchedule.CourseSchedule;
import Business.Department.Department;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    
    CourseCatalog coursecatalog;
    CourseSchedule courseschedule;
    


    public Business(String n) {
        name = n;

        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();
        facultydirectory = new FacultyDirectory();
        
        coursecatalog = new CourseCatalog(this.getDepartment());
        courseschedule = new CourseSchedule("Default Semester", coursecatalog);


    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public StudentDirectory getStudentDirectory(){
        return studentdirectory;
    }
    
    public FacultyDirectory getFacultyDirectory() {
        return facultydirectory;
    }
    
    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }
    
    public Department getDepartment(){
        return new Department(name);
    }
    
    public CourseSchedule getCourseSchedule() {
        return courseschedule;
    }
    

}
