package PetRockExample;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {
    private String prName = "Guatape";
    private PetRock pr = new PetRock(prName);
    @Test
    void getName() {
        assertEquals(prName,pr.getName());
    }

    @Test
    void testUnhappyToStart() {
        assertFalse(pr.isHappy());
    }

    @Test
    void testHappyAfterPlay() {
        pr.play();
        assertTrue(pr.isHappy());
    }
}