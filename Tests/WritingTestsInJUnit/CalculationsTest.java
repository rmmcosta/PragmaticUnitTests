package WritingTestsInJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculationsTest {

    private final Calculations calc = new Calculations();
    @Test
    public void addTest() {
        int result = 5;
        assertEquals(result,calc.add(3,2));
        assertEquals(result,calc.add(4,1));
        assertEquals(result,calc.add(1,4));
        assertEquals(result,calc.add(2,3));
        assertEquals(result,calc.add(0,5));
    }

    @Test
    public void subTest() {
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