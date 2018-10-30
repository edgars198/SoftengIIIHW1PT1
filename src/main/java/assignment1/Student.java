package assignment1;
import java.util.*;

public class Student {
    String name;
    int age;
    String DOB;
    int ID;
    String username;
    ArrayList takingModules = new ArrayList();
    ArrayList enrolledCourses = new ArrayList();
    
    
    //constructor
    public Student (String InName, int InAge, String InDOB, int InID){
        name = InName;
        age = InAge;
        DOB = InDOB;
        ID = InID;
    }

}
