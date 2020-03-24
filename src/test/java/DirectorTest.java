import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Harvey", 4567, 70000,"IT", 150000);
    }

    @Test
    public void directorHasName(){
        assertEquals("Harvey", director.getName());
    }
    @Test
    public void directorHasSalary(){
        assertEquals(70000, director.getSalary());
    }

    @Test
    public void directorHasDepartment(){
        assertEquals("IT", director.getDepartmentName());
    }

    @Test
    public void directorSalaryRaised(){
        assertEquals((70000+1000),director.raiseSalary(1000));
    }

    @Test
    public void directorGetsBonus(){
        assertEquals(700,director.payBonus());
    }
}
