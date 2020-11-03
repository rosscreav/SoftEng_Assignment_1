package Software_Eng.Assignment1;

import junit.framework.TestCase;
import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Unit test for Module Class
 */
public class ModuleTest 
    extends TestCase
{

    //Test addStudent Method
    public void testaddStudent()
    {
        //Test object
        Module module = new Module("Name","ID");
        //Mock Student object
        Student student = new Student("Ross Creaven",24,new DateTime(),17473436);
        //Expected output
        ArrayList<Student> s =new ArrayList<>();
        s.add(student);
        //Method call
        module.addStudent(student);
        //Check Student was added
        assertEquals(s,module.getStudents());
    }

    //Test addCourse Method
    public void testaddCourse()
    {
        //Test object
        Module module = new Module("Name","ID");
        //Expected output
        ArrayList<String> c =new ArrayList<>();
        c.add("c1");
        //Method call
        module.addCourse("c1");
        //Check Student was added
        assertEquals(c,module.getCourses());
    }

    //Test toString method
    public void testtoString(){
        //Test object
        Module module = new Module("Name","ID");
        //Test against expected output
        assertEquals("Name",module.toString());
    }

}
