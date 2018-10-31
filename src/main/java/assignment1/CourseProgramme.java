package assignment1;
import java.util.*;
import org.joda.time.DateTime;


public class CourseProgramme {
    String CourseName;
    ArrayList<Module> listOfModules = new ArrayList();
    ArrayList<Student> enrolledStudents = new ArrayList();
    DateTime academicStartDate = new DateTime();
    DateTime academicEndDate = new DateTime();
    
    //constructor
    public CourseProgramme (String name){
        CourseName = name;
    }
    //add student to course
    public void addStudent(Student stu){
      enrolledStudents.add(stu);  
    }
    //add module to course
    public void addModules (ArrayList<Module> modulesOfCourse){
        this.listOfModules = modulesOfCourse;
    }
    //add start time of the course  
    public void startTime (DateTime time){
        academicStartDate = time;
    }
    //add end time of the course
    public void endTime (DateTime time){
        academicEndDate = time;
    }
    
}
