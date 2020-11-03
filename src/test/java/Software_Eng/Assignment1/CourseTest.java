package Software_Eng.Assignment1;

import junit.framework.TestCase;
import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Unit test for Course class
 */
public class CourseTest 
    extends TestCase
{
    //Test addModule method
    public void testaddModule()
    {
        //Test Object
        Course course = new Course("Name",new DateTime(),new DateTime());
        //Mock Module
        Module module = new Module("Name","ID");
        //Creating Expected output
        ArrayList<Module> m = new ArrayList<>();
        m.add(module);
        //Method call
        course.addModule(module);
        //Test
        assertEquals(m,course.getModules());
    }

    //Test toString method
    public void testtoString()
    {
        //Test Object
        Course course = new Course("Name",new DateTime(),new DateTime());
        //Check output is name
        assertEquals("Name",course.toString());
    }

}
