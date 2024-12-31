/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseCatalog;

/**
 *
 * @author HP
 */
public class Course {
    
    String number;
    String name;
    
    int credits;
    int price = 1500; //per credit hour
    
    public Course(String n, String numb, int ch) {
        name = n;
        number = numb;
        credits = ch;
    }
    
    public String getCourseNumber() {
        return number;
    }
    
    public int getCoursePrice() {
        return price * credits;
    }
    
    public int getCredits() {
        return credits;
    } 
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return name;
    
    }
}
