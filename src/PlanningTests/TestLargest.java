package PlanningTests;

import junit.framework.TestCase;

public class TestLargest extends TestCase {
    public void testSimple() {
        assertEquals(9, Largest.largest(new int[]{9, 8, 7}));
    }

    public void testSimple2() {
        assertEquals(9, Largest.largest(new int[]{7, 8, 9}));
    }

    public void testSimple3() {
        assertEquals(0, Largest.largest(new int[]{0, -7, -8, -9}));
    }

    public void testEmpty() {
        try {
            Largest.largest(new int[]{});
            fail("Should have thrown an exception!");
        } catch (RuntimeException e) {
            assertEquals("Empty list!", e.getMessage());
        } catch (Exception e) {
            fail("Should have return runtime exception!");
        }
    }
}
