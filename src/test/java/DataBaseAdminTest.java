import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {
    DatabaseAdmin dba;

    @Before
    public void before(){
       dba = new DatabaseAdmin("John", 5678, 50000);
    }

    @Test
    public void dataBaseAdminHasName(){
        assertEquals("John", dba.getName());
    }

    @Test
    public void dataBaseAdminHasSalary(){
        assertEquals((50000+1000),dba.raiseSalary(1000));
    }

    @Test
    public void dataBaseAdminGetsBonus(){
        assertEquals(500,dba.payBonus());
    }
}
