package Staff.techStaff;

import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Oscar Martinez", "N15T46", 23000);
    }

    @Test
    public void canGetName() {
        assertEquals("Oscar Martinez", databaseAdmin.getName());
    }

    @Test
    public void canGetNI() {
        assertEquals("N15T46", databaseAdmin.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(23000, databaseAdmin.getSalary(), 0.0);
    }

}