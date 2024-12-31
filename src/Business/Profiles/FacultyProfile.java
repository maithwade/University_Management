/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.CourseSchedule.CourseOffer;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class FacultyProfile extends Profile{
    
    Person person;
    
    ArrayList<FacultyAssignment> facultyassignments;
    
    public FacultyProfile(Person p) {
        
        super(p);
        person = p;
        facultyassignments = new ArrayList();
        
    }
    
    public double getProfAverageOverallRating() {
        
        double sum = 0.0;
        //for each fcultyassignment extract class rating 
        //add them up and divide by the number of teaching assignment
        for (FacultyAssignment fa: facultyassignments) {
            
            sum = sum + fa.getRating();
        }
        //divide by the total number of faculty assignments
        return sum/(facultyassignments.size() * 1.0);
        
    }
    
    public FacultyAssignment AssignAsTeacher(CourseOffer co) {
        return null;
    }
    
    public boolean isMatch(String id) {
        if(person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String getRole() {
        return "Faculty";
    }
    
}
