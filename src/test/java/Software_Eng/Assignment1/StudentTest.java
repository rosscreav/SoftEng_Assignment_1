package Software_Eng.Assignment1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.DateTime;
/**
 * Unit test for simple App.
 */
public class StudentTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StudentTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StudentTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testgetUsername()
    {
        Student student = new Student("Ross Creaven",24,new DateTime(),17473436);
        assertEquals("RossCreaven24",student.getUsername());
    }
}
