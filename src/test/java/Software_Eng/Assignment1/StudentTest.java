package Software_Eng.Assignment1;

import junit.framework.TestCase;
import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 * Unit test for Student Class
 */
public class StudentTest 
    extends TestCase
{
    //Test getUsername creation and method
    public void testgetUsername()
    {
        //Test Object
        Student student = new Student("Ross Creaven",24,new DateTime(),17473436);
        //Compare to expected Username
        assertEquals("RossCreaven24",student.getUsername());
    }

    //Test addModule method
    public void testaddModule()
    {
        //Test Object
        Student student = new Student("Ross Creaven",24,new DateTime(),17473436);
        //Create expected output
        ArrayList<String> output = new ArrayList<>();
        output.add("m1");output.add("m2");
        //add modules
        student.addModule("m1");
        student.addModule("m2");
        //Test duplicates
        student.addModule("m1");
        assertEquals(output,student.getModules());
    }

    //Test addCourse method
    public void testaddCourse()
    {
        //Test Object
        Student student = new Student("Ross Creaven",24,new DateTime(),17473436);
        //Create expected output
        ArrayList<String> output = new ArrayList<>();
        output.add("c1");output.add("c2");
        //add courses
        student.addCourse("c1");
        student.addCourse("c2");
        //Test duplicates
        student.addModule("c1");
        assertEquals(output,student.getCourses());
    }

    //Test toString method
    public void testtoString()
    {
        //Mocking values for toString
        Student student = new Student("Ross Creaven",24,new DateTime(),17473436);
        //Add mock course and module
        student.addCourse("c1");
        student.addModule("m1");
        //Compare toString with removed spaces
        assertEquals("Username:RossCreaven24Modules:[m1]Courses:[c1]",student.toString().replaceAll("\\s+", ""));

    }

}
