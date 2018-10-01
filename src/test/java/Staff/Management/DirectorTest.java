package Staff.Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {


    Director director;

    @Before
    public void before(){
        director = new Director("Micheal Scott", "N12345", 50000, "Paper Sale", 500000);
    }

    @Test
    public void canGetName() {
        assertEquals("Micheal Scott", director.getName());
    }

    @Test
    public void canGetNI() {
        assertEquals("N12345", director.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, director.getSalary(), 0.0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Paper Sale", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(500000, director.getBudget());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(60000, director.raiseSalary(1.2), 0.0);
    }

    @Test
    public void cantRaiseSalaryByNegative(){
        assertEquals(50000, director.raiseSalary(-0.2), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, director.payBonus(), 0.0);
    }

}