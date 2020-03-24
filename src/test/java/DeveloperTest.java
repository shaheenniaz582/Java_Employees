import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("John", 5678, 50000);
    }

    @Test
    public void developerHasName(){
        assertEquals("John", developer.getName());
    }

    @Test
    public void developerHasSalary(){
        assertEquals((50000+1000),developer.raiseSalary(1000));
    }

    @Test
    public void developerrGetsBonus(){
        assertEquals(500,developer.payBonus());
    }
}
