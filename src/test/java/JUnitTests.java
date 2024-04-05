import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTests {
    @Test
    public void calculatorAdditionTest() {
        Calculator calculator = new Calculator();
        assertEquals("Addition result is wrong", 10, calculator.add(2, 8));
    }

    @Test
    public void calculatorSubstructionTest() {
        Calculator calculator = new Calculator();
        assertEquals("Substruction result is wrong", 6, calculator.subtract(8, 2));
    }

    @Test
    public void calculatorMultiplicationTest() {
        Calculator calculator = new Calculator();
        assertEquals("Multiplication result is wrong", 16, calculator.multiply(8, 2));
    }

    @Test
    public void calculatorDivisionTest() {
        Calculator calculator = new Calculator();
        assertEquals("Division result is wrong", 4, calculator.divide(8, 2));
    }

    @Test
    public void evenNumberTest() {
        assertTrue("Number is not even", EvenOddChecker.check(4));
    }

    @Test
    public void oddNumberTest() {
        assertFalse("Number is not odd", EvenOddChecker.check(1));
    }
    @Test
    public void testGetRectangleLength() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(5.0, rectangle.getLength(), 0.0001);
    }

    @Test
    public void testSetRectangleLength() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        rectangle.setLength(7.5);
        assertEquals(7.5, rectangle.getLength(), 0.0001);
    }

    @Test
    public void testGetRectangleWidth() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(10.0, rectangle.getWidth(), 0.0001);
    }

    @Test
    public void testSetRectangleWidth() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        rectangle.setWidth(15.0);
        assertEquals(15.0, rectangle.getWidth(), 0.0001);
    }

    @Test
    public void testGetRectangleArea() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(50.0, rectangle.getArea(), 0.0001);
    }
}
