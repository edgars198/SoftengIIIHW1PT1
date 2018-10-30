package assignment1;
import java.util.*;

public class Module {
    String moduleName;
    String ID;
    ArrayList studentsTakingClass = new ArrayList();
    ArrayList coursesAssociated = new ArrayList();
    
    //constrructor
    public Module (String modName, String IID){
        moduleName = modName;
        ID = IID;
    }
    //add studetns that aretaking the module
    public void addStudent(Student stu){
        studentsTakingClass.add(stu);
    }
    //add courses that are connected to the module
    public void addCourses(CourseProgramme course){
        coursesAssociated.add(course);
    }
    
}
