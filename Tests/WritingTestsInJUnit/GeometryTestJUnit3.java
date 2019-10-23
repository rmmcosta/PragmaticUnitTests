package WritingTestsInJUnit;

import junit.framework.TestCase;

public class GeometryTestJUnit3 extends TestCase {
    private final Geometry geo = new Geometry();

    public GeometryTestJUnit3(String method) {
        super(method);
    }

    public void testCalcCircleArea() {
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
}
