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
    void testAddPositiveNumbers() {
        assertEquals(7.0, calculator.add(3.0, 4.0), 1e-9);
    }

    @Test
    void testAddNegativeNumber() {
        assertEquals(-1.0, calculator.add(2.0, -3.0), 1e-9);
    }

    @Test
    void testSubtractPositiveResult() {
        assertEquals(6.0, calculator.subtract(10.0, 4.0), 1e-9);
    }

    @Test
    void testSubtractNegativeResult() {
        assertEquals(-5.0, calculator.subtract(2.0, 7.0), 1e-9);
    }

    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(12.0, calculator.multiply(3.0, 4.0), 1e-9);
    }

    @Test
    void testMultiplyByZero() {
        assertEquals(0.0, calculator.multiply(5.0, 0.0), 1e-9);
    }

    @Test
    void testDivideNormal() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), 1e-9);
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5.0, 0.0));
    }
}