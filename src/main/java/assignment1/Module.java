package assignment1;
import java.util.*;

public class Module {
    String moduleName;
    String ID;
    ArrayList<Student> studentsTakingClass = new ArrayList();
    ArrayList<CourseProgramme> coursesAssociated = new ArrayList();
    
    //constrructor
    public Module (String modName, String IID){
        moduleName = modName;
        ID = IID;
    }
    //add arraylist of studetns that are taking the module
    public void addStudent(ArrayList<Student> IncomingStudents){
        this.studentsTakingClass = IncomingStudents;
    }
    //add courses that are connected to the module
    public void addCourses(CourseProgramme course){
        coursesAssociated.add(course);
    }
    
}
