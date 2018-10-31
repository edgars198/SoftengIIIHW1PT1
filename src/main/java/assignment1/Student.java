package assignment1;

public class Student {
    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;
    
    
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

    
    @Override
    public String toString(){
        return (this.ID+" "+this.name+" "+this.username);
    
    }
    
}
