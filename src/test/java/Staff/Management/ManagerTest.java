package Staff.Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Dwight Schrute", "N26G67", 30000, "Paper Sale");
    }

    @Test
    public void canGetName() {
        assertEquals("Dwight Schrute", manager.getName());
    }

    @Test
    public void canGetNI() {
        assertEquals("N26G67", manager.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Paper Sale", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(36000, manager.raiseSalary(1.2), 0.0);
    }

    @Test
    public void cantRaiseSalaryByNegative(){
        assertEquals(30000, manager.raiseSalary(-0.2), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus(), 0.0);
    }

}