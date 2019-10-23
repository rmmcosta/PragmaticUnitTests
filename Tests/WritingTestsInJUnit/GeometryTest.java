package WritingTestsInJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeometryTest {
    private final Geometry geo = new Geometry();
    @Test
    public void calcCircleAreaTest() {
        double area = 12.56;
        assertEquals(area,geo.calcCircleArea(2),0.01);
        try {
            geo.calcCircleArea(0);
            fail("Passing 0 and not throwing exception!");
        } catch (RuntimeException re) {
            System.out.println(re);
            assertTrue(true);
        }
    }

    @Test
    public void throwExceptionTest(){
    }
}