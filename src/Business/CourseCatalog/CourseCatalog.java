/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseCatalog;

import Business.Business;
import Business.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CourseCatalog {
    
    Business business;
    Department department;
    String lastupdated;
    ArrayList<Course> courselist;
    
    public CourseCatalog(Department d) {
        courselist = new ArrayList();
        this.department = d;
//        business = b;
    }
    
    public Course newCourse(String n, String nm, int cr){
        Course c = new Course(n, nm, cr);
        courselist.add(c);
        return c;
    }
    
    public Course getCourseByNumber(String n){
        for(Course c : courselist) {
            if(c.getCourseNumber().equals(n)) return c;
        }
        return null;
    }
    
    public ArrayList<Course> getCourseList() {
        return courselist;
    }
    
}
