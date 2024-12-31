/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    Profile profile;
    String username;
    String password;
    private String status;
    
    public UserAccount (Profile profile, String un, String pw, String status){
        username = un;
        password = pw;
        this.profile = profile;
        this.status = status;
    }

    public String getPersonId(){
        if(profile != null && profile.getPerson() != null) {
            return profile.getPerson().getPersonId();
        } else {
            return "N/A";
        }
    }
    
    
    
    public String getUserLoginName(){
        return username;
    }
    
    public void setUserLoginName(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    public String getStatus() {
        return status;
    }
    
    

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
        public boolean IsValidUser(String un, String pw){
            if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
            else return false;
        
        }
        public String getRole(){
            return profile.getRole();
        }
        
        public Profile getAssociatedPersonProfile(){
            return profile;
        }
        
    @Override
        public String toString(){
            
            return getUserLoginName();
        }
        
}

