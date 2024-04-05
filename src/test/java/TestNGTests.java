import org.testng.annotations.*;

import static org.testng.Assert.*;

public class TestNGTests {
    @Test
    public void calculatorAdditionTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(2, 8), 10, "Addition result is wrong");
    }

    @Test
    public void calculatorSubstructionTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtract(8, 2), 6, "Substruction result is wrong");
    }

    @Test
    public void calculatorMultiplicationTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(8, 2), 16, "Multiplication result is wrong");
    }

    @Test
    public void calculatorDivisionTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.divide(8, 2), 4, "Division result is wrong");
    }

    @Test
    public void evenNumberTest() {
        assertTrue(EvenOddChecker.check(4), "Number is not even");
    }

    @Test
    public void oddNumberTest() {
        assertFalse(EvenOddChecker.check(1), "Number is not odd");
    }

    @Test
    public void testGetRectangleLength() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(rectangle.getLength(), 5.0, 0.0001);
    }

    @org.junit.Test
    public void testSetRectangleLength() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        rectangle.setLength(7.5);
        assertEquals(rectangle.getLength(), 7.5, 0.0001);
    }

    @org.junit.Test
    public void testGetRectangleWidth() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(rectangle.getWidth(), 10.0, 0.0001);
    }

    @org.junit.Test
    public void testSetRectangleWidth() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        rectangle.setWidth(15.0);
        assertEquals(rectangle.getWidth(), 15.0, 0.0001);
    }

    @org.junit.Test
    public void testGetRectangleArea() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(rectangle.getArea(), 50.0, 0.0001);
    }
}

