package Staff.techStaff;

import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jim Halpert", "N20T30", 25000);
    }

    @Test
    public void canGetName() {
        assertEquals("Jim Halpert", developer.getName());
    }

    @Test
    public void canGetNI() {
        assertEquals("N20T30", developer.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000, developer.getSalary(), 0.0);
    }

}