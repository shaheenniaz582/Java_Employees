import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", 17890, 50000, "IT");
    }

    @Test
    public void managerHasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void managerHasDepartment(){
        assertEquals("IT", manager.getDepartmentName());
    }

    @Test
    public void managerSalaryRaised(){
        assertEquals((50000+1000),manager.raiseSalary(1000));
    }

    @Test
    public void managerGetsBonus(){
        assertEquals(500,manager.payBonus());
    }
}
