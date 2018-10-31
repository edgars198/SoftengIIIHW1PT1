package assignment1;
import java.util.*;

public class Student {
    String name;
    int age;
    String DOB;
    int ID;
    String username;
    ArrayList<Module> takingModules = new ArrayList();
    ArrayList<CourseProgramme> enrolledCourses = new ArrayList();
    
    
    //constructor
    public Student (String InName, int InAge, String InDOB, int InID){
        name = InName;
        age = InAge;
        DOB = InDOB;
        ID = InID;
    }
    
    
    //returns username as specified in the requirements
    public String getUsername(){
        return name+DOB;
    }
    
    //add module to student
    public void addModule (Module mod){
        takingModules.add(mod);
    }
    
    //add course to student
    public void addCourse(CourseProgramme course){
        enrolledCourses.add(course);
    }
    
}
