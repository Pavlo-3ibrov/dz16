import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(7.0, calculator.add(3.0, 4.0), 1e-9);
        assertEquals(-1.0, calculator.add(2.0, -3.0), 1e-9);
    }

    @Test
    void testSubtract() {
        assertEquals(6.0, calculator.subtract(10.0, 4.0), 1e-9);
        assertEquals(-5.0, calculator.subtract(2.0, 7.0), 1e-9);
    }

    @Test
    void testMultiply() {
        assertEquals(12.0, calculator.multiply(3.0, 4.0), 1e-9);
        assertEquals(0.0, calculator.multiply(5.0, 0.0), 1e-9);
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), 1e-9);
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5.0, 0.0));
    }
}