/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;

/**
 *
 * @author Edgars
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //array list that contains students
        ArrayList<Student> studentsTakingClass = new ArrayList();
        ArrayList<Module> modulesAssociated = new ArrayList();
        
        //populating the arraylist
        studentsTakingClass.add(new Student("Joe", 19, "19951106", 112));
        studentsTakingClass.add(new Student("Sacy", 20, "19940806", 445));
        studentsTakingClass.add(new Student("Bobby", 17, "19981205", 445));
        studentsTakingClass.add(new Student("Debbie", 18, "19981202", 498));
        
        //creating new modules
        Module softEngIII = new Module("Software Engineering III", "CT101");
        Module classicsII = new Module("Classic Studies", "CL201");
        Module calculus = new Module("Calculus", "CA444");
        
        //adding students to modules
        softEngIII.addStudent(studentsTakingClass);
        classicsII.addStudent(studentsTakingClass);
        calculus.addStudent(studentsTakingClass);
        
        //creating an arts course
        CourseProgramme arts = new CourseProgramme("Arts");
        
        //adding modules to arraylist
        modulesAssociated.add(softEngIII);
        modulesAssociated.add(classicsII);
        modulesAssociated.add(calculus);
        
        //adding modules to course
        arts.addModules(modulesAssociated);
        
        //, the program should print out a list of all the courses, their respective modules, and all students, their usernames, assigned modules and the course(s) they are registered for to the console. 
        System.out.println(arts);
        
       
        
    }
    
}
