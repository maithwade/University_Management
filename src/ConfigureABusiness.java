/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package Business;

import Business.CourseCatalog.Course;
import Business.CourseCatalog.CourseCatalog;
import Business.CourseSchedule.CourseOffer;
import Business.CourseSchedule.CourseSchedule;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;


/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");

// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();
// person representing people associated with the business        
        //Faculties
        Person person000 = persondirectory.newPerson("0112300", "Kyle Johnson");
        Person person001 = persondirectory.newPerson("0112301", "John Smith");
        Person person002 = persondirectory.newPerson("0112302", "Kathy Sun");
        Person person003 = persondirectory.newPerson("0112303", "Nancy Smith");
        Person person004 = persondirectory.newPerson("0112304", "Alex Kim");
        Person person005 = persondirectory.newPerson("0112305", "David Lee");
        Person person006 = persondirectory.newPerson("0112306", "Amanda Williams");
        Person person007 = persondirectory.newPerson("0112307", "Lydia John");
        Person person008 = persondirectory.newPerson("0112308", "Arvind Patel");
        Person person009 = persondirectory.newPerson("0112309", "Rajesh Kumar"); 
        Person person010 = persondirectory.newPerson("0112310", "Rahul Singh");
        
        //Students 
        Person person011 = persondirectory.newPerson("1112303", "Ethan Johnson");
        Person person012 = persondirectory.newPerson("1112304", "Olivia Miller");
        Person person013 = persondirectory.newPerson("1112305", "Jackson Davis");
        Person person014 = persondirectory.newPerson("1112306", "Ava wilson");
        Person person015 = persondirectory.newPerson("1112307", "Liam Brown");
        Person person016 = persondirectory.newPerson("1112308", "Emma Jones");
        Person person017 = persondirectory.newPerson("1112309", "Noah Taylor");
        Person person018 = persondirectory.newPerson("1112310", "Sophia Anderson");
        Person person019 = persondirectory.newPerson("1112311", "Jerry Jung");
        Person person020 = persondirectory.newPerson("1112312", "Tom Kim");
        Person person021 = persondirectory.newPerson("1112313", "William Chen");

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person000);

        
        FacultyDirectory facultydirectory = business.getFacultyDirectory();
        FacultyProfile facultyprofile1 = facultydirectory.newFacultyProfile(person001);
        FacultyProfile facultyprofile2 = facultydirectory.newFacultyProfile(person002);
        FacultyProfile facultyprofile3 = facultydirectory.newFacultyProfile(person003);
        FacultyProfile facultyprofile4 = facultydirectory.newFacultyProfile(person004);
        FacultyProfile facultyprofile5 = facultydirectory.newFacultyProfile(person005);
        FacultyProfile facultyprofile6 = facultydirectory.newFacultyProfile(person006);
        FacultyProfile facultyprofile7 = facultydirectory.newFacultyProfile(person007);
        FacultyProfile facultyprofile8 = facultydirectory.newFacultyProfile(person008);
        FacultyProfile facultyprofile9 = facultydirectory.newFacultyProfile(person009);
        FacultyProfile facultyprofile10 = facultydirectory.newFacultyProfile(person010);
        
        
        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentprofile0 = studentdirectory.newStudentProfile(person011);
        StudentProfile studentprofile1 = studentdirectory.newStudentProfile(person012);
        StudentProfile studentprofile2 = studentdirectory.newStudentProfile(person013);
        StudentProfile studentprofile3 = studentdirectory.newStudentProfile(person014);
        StudentProfile studentprofile4 = studentdirectory.newStudentProfile(person015);
        StudentProfile studentprofile5 = studentdirectory.newStudentProfile(person016);
        StudentProfile studentprofile6 = studentdirectory.newStudentProfile(person017);
        StudentProfile studentprofile7 = studentdirectory.newStudentProfile(person018);
        StudentProfile studentprofile8 = studentdirectory.newStudentProfile(person019);
        StudentProfile studentprofile9 = studentdirectory.newStudentProfile(person020);
        StudentProfile studentprofile10 = studentdirectory.newStudentProfile(person021);
     
   
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(employeeprofile0, "kyle", "****", "Active");
        UserAccount ua2 = uadirectory.newUserAccount(facultyprofile1, "johnsmith", "****", "Active");
        UserAccount ua3 = uadirectory.newUserAccount(facultyprofile2, "kathysun", "****", "Active");
        UserAccount ua4 = uadirectory.newUserAccount(facultyprofile3, "nancysmith", "****", "Active");
        UserAccount ua5 = uadirectory.newUserAccount(facultyprofile4, "alexkim", "****", "Active");
        UserAccount ua6 = uadirectory.newUserAccount(facultyprofile5, "davidlee", "****", "Active");
        UserAccount ua7 = uadirectory.newUserAccount(facultyprofile6, "amandawilliams", "****", "Active");
        UserAccount ua8 = uadirectory.newUserAccount(facultyprofile7, "lydiajohn", "****", "Active");
        UserAccount ua9 = uadirectory.newUserAccount(facultyprofile8, "arvindpatel", "****", "Active");
        UserAccount ua10 = uadirectory.newUserAccount(facultyprofile9, "rajeshkumar", "****", "Active");
        UserAccount ua11 = uadirectory.newUserAccount(facultyprofile10, "rahulsingh", "****", "Active");

        UserAccount ua12 = uadirectory.newUserAccount(studentprofile0, "ethanjohnson", "****", "Active");
        UserAccount ua13 = uadirectory.newUserAccount(studentprofile1, "oliviamiller", "****", "Active");
        UserAccount ua14 = uadirectory.newUserAccount(studentprofile2, "jacksondavis", "****", "Active");
        UserAccount ua15 = uadirectory.newUserAccount(studentprofile3, "avawilson", "****", "Active");
        UserAccount ua16 = uadirectory.newUserAccount(studentprofile4, "liambrown", "****", "Active");
        UserAccount ua17 = uadirectory.newUserAccount(studentprofile5, "emmajones", "****", "Active");
        UserAccount ua18 = uadirectory.newUserAccount(studentprofile6, "noahtaylor", "****", "Active");
        UserAccount ua19 = uadirectory.newUserAccount(studentprofile7, "sophiaanderson", "****", "Active");
        UserAccount ua20 = uadirectory.newUserAccount(studentprofile8, "jerryjung", "****", "Active");
        UserAccount ua21 = uadirectory.newUserAccount(studentprofile9, "tomkim", "****", "Active");
        UserAccount ua22 = uadirectory.newUserAccount(studentprofile10, "william", "****", "Active"); 
        
        CourseCatalog courseCatalog = business.getCourseCatalog();
        Course course1 = courseCatalog.newCourse("Application Engineering and Developement", "INFO 5100", 4);
        Course course2 = courseCatalog.newCourse("Web Design and User Experience Engineering", "INFO 6150", 4);
        Course course3 = courseCatalog.newCourse("Program Structures and Algorithms", "INFO 6250", 4);
        Course course4 = courseCatalog.newCourse("Database Management and Database Design", "INFO 6210", 4);
        Course course5 = courseCatalog.newCourse("Concepts of Object-Oriented Design", "CSYE 6200", 4);
        Course course6 = courseCatalog.newCourse("User Experience Design and Testing", "CSYE 7280", 4);
        Course course7 = courseCatalog.newCourse("Data Science Engineering with Python", "DAMG 6105", 4);
        Course course8 = courseCatalog.newCourse("Smartphones-Based Web Development", "INFO 6350", 4);
        Course course9 = courseCatalog.newCourse("Web Development Tools and Methods", "INFO 6250", 4);
        Course course10 = courseCatalog.newCourse("Business Analysis and Information Engineering", "INFO 6215", 4);
        
        
        //Creating a course schedule for Spring 2024  semester
        
        CourseSchedule courseschedule = business.getCourseSchedule();
        
        CourseOffer courseOffer1 = courseschedule.newCourseOffer(course1.getCourseNumber());
        CourseOffer courseOffer2 = courseschedule.newCourseOffer(course2.getCourseNumber());
        CourseOffer courseOffer3 = courseschedule.newCourseOffer(course3.getCourseNumber());
        CourseOffer courseOffer4 = courseschedule.newCourseOffer(course4.getCourseNumber());
        CourseOffer courseOffer5 = courseschedule.newCourseOffer(course5.getCourseNumber());
        CourseOffer courseOffer6 = courseschedule.newCourseOffer(course6.getCourseNumber());
        CourseOffer courseOffer7 = courseschedule.newCourseOffer(course7.getCourseNumber());
        CourseOffer courseOffer8 = courseschedule.newCourseOffer(course8.getCourseNumber());
        CourseOffer courseOffer9 = courseschedule.newCourseOffer(course9.getCourseNumber());
        CourseOffer courseOffer10 = courseschedule.newCourseOffer(course10.getCourseNumber());
        
        courseOffer1.generateSeats(20);
        courseOffer2.generateSeats(20);
        courseOffer3.generateSeats(20);
        courseOffer4.generateSeats(20);
        courseOffer5.generateSeats(20);
        courseOffer6.generateSeats(20);
        courseOffer7.generateSeats(20);
        courseOffer8.generateSeats(20);
        courseOffer9.generateSeats(20);
        courseOffer10.generateSeats(20);
        
        //Assigning Faculties to the courses
        
        courseOffer1.AssignAsTeacher(facultyprofile1);
        courseOffer2.AssignAsTeacher(facultyprofile2);
        courseOffer3.AssignAsTeacher(facultyprofile3);
        courseOffer4.AssignAsTeacher(facultyprofile4);
        courseOffer5.AssignAsTeacher(facultyprofile5);
        courseOffer6.AssignAsTeacher(facultyprofile6);
        courseOffer7.AssignAsTeacher(facultyprofile7);
        courseOffer8.AssignAsTeacher(facultyprofile8);
        courseOffer9.AssignAsTeacher(facultyprofile9);
        courseOffer10.AssignAsTeacher(facultyprofile10);
        
        
        

        return business;

    }

}
