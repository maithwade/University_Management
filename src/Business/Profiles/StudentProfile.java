/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.CourseSchedule.CourseLoad;
import Business.CourseSchedule.SeatAssignment;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

//    Person person;
    Transcript transcript;
    //EmploymentHistroy employmenthistory;

    public StudentProfile(Person p) {
        super(p);
        transcript = new Transcript(this);
        //employmenthistory = new EmploymentHistroy();
    }

    public Transcript getTranscript() {
        return transcript;
    }
    
    public CourseLoad getCourseLoadBySemester(String semester) {
        return transcript.getCourseLoadBySemester(semester);  
    }
    
    public CourseLoad getCurrentCourseLoad() {
        return transcript.getCurrentCourseLoad();
    }
    
    public CourseLoad newCourseLoad(String s) {
        return transcript.newCourseLoad(s);
    }
    
    public ArrayList<SeatAssignment> getCourseList() {
        return transcript.getCourseList();
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    @Override
    public String getRole() {
        return "Student";
    }

    public boolean isMatch(String id) {
        return getPerson().getPersonId().equals(id);
    }

}
