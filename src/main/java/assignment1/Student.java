package assignment1;

public class Student {
    String name;
    int age;
    String DOB;
    int ID;
    String username;
    
    
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
        return (ID+" "+name+" "+username);
    
    }
    
}
