package assignment1;
import java.util.*;

public class Module {
    String moduleName;
    String ID;
    ArrayList<Student> studentsTakingClass = new ArrayList();

    
    //constrructor
    public Module (String modName, String IID){
        moduleName = modName;
        ID = IID;
    }
    //add arraylist of students that are taking the module
    public void addStudent(ArrayList<Student> IncomingStudents){
        this.studentsTakingClass = IncomingStudents;
    }
    
    @Override
    public String toString(){
    
        String toPrint;
        toPrint = ("Module name: "+moduleName+" Module ID: "+ID+"\n"+"Students Enrolled: ");
        
        toPrint.concat(studentsTakingClass.toString());
        
        
        return(toPrint);
    }
    
}
