/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Department.Department;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class FacultyDirectory {
    
    Department department;
    private ArrayList<FacultyProfile> teacherlist;
    
    public FacultyDirectory() {
        teacherlist = new ArrayList<>();
    }
    
    public ArrayList<FacultyProfile> getTeacherlist() {
        return teacherlist;
    }
    
    public FacultyProfile newFacultyProfile(Person p) {
        FacultyProfile facultyprofile = new FacultyProfile(p);
        teacherlist.add(facultyprofile);
        return facultyprofile;
    }
    
    public FacultyProfile  getTopProfessor() {
        
        double bestratingsofar = 0.0;
        FacultyProfile BestProfSoFar = null;
        for(FacultyProfile fp: teacherlist) 
            if(fp.getProfAverageOverallRating() > bestratingsofar) {
            bestratingsofar = fp.getProfAverageOverallRating();
            BestProfSoFar = fp;
            }
            return BestProfSoFar;
        
    }
    
    public FacultyProfile findTeachingFaculty(String id) {
        
        for(FacultyProfile sp : teacherlist) {
            if(sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the while list 
    }
    
    
}
