package assignment1;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
    
    public StudentTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getUsername method, of class Student.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        Student instance = new Student("Joe", 19, "1995", 55);
        String expResult = "Joe1995";
        String result = instance.getUsername();
        assertEquals(expResult, result);   
    } 
}
