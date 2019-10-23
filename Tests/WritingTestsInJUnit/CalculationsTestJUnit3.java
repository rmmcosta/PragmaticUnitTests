package WritingTestsInJUnit;

import junit.framework.TestCase;

public class CalculationsTestJUnit3 extends TestCase {
    public CalculationsTestJUnit3(String name) {
        super(name);
    }

    private final Calculations calc = new Calculations();

    public void testAdd() {
        int result = 5;
        assertEquals(result,calc.add(3,2));
        assertEquals(result,calc.add(4,1));
        assertEquals(result,calc.add(1,4));
        assertEquals(result,calc.add(2,3));
        assertEquals(result,calc.add(0,5));
    }


    public void testSub() {
        int result = 2;
        assertEquals(result,calc.sub(4,2));
        try {
            calc.sub(2,3);
            fail("a smaller then b and exception not thrown!");
        } catch(RuntimeException re) {
            System.out.println(re);
            assertTrue(true);
        }
    }
}
