import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTestNGTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(3, 4), 7);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(3, 5), 15);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.divide(20, 5), 4);
    }
}