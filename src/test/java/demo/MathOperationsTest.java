package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {
    private final MathOperations math = new MathOperations();

    @Test
    void testAdd() {
        assertEquals(5, math.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, math.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, math.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, math.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> math.divide(1, 0));
    }
}
