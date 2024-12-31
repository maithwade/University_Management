/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String id;
    String name; //new

    public Person(String id, String name) { //addition

        this.id = id;
        this.name = name;
    }

    public String getPersonId() {
        return id;
    }
    
    public void setPersonId(String id) {
        this.id = id;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    @Override
    public String toString() {
        return getPersonId();
    }
}
