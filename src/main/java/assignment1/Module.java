package assignment1;
import java.util.*;

public class Module {
    private String moduleName;
    private String ID;
    private ArrayList<Student> studentsTakingClass = new ArrayList();

    
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
        toPrint = ("Module name: "+this.moduleName+" Module ID: "+this.ID+"\n"+"Students Enrolled: ");
        
        for (Student number : studentsTakingClass) {
            toPrint.concat(number.toString()).concat("\n");
        }
        
        return(toPrint);
    }
    
}
