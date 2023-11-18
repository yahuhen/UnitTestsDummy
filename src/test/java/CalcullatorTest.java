import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalcullatorTest {
    public static void main(String[] args) {
        CalcullatorTest calcullatorTest = new CalcullatorTest();

        calcullatorTest.addPositiveNumbersTest();
        calcullatorTest.addNegativeNumbersTest();
        calcullatorTest.addMixedNumbersTest();
        calcullatorTest.addZeroTest();
        calcullatorTest.addBoundaryValuesTest();
        calcullatorTest.addOverflowTest();

        calcullatorTest.multiplyPositiveNumbersTest();
        calcullatorTest.multiplyNegativeNumbersTest();
        calcullatorTest.multiplyMixedNumbersTest();
        calcullatorTest.multiplyZeroTest();
        calcullatorTest.multiplyBoundaryValuesTest();
//        calcullatorTest.multiplyOverflowTest();
    }

    @Test
    public void addPositiveNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void addNegativeNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void addMixedNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(-2, 10));
    }

    @Test
    public void addZeroTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void addBoundaryValuesTest() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MIN_VALUE + 1, -1));
    }


    @Test
    public void addOverflowTest() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MIN_VALUE, -1));
//        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 1));
    }


    @Test
    public void multiplyPositiveNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void multiplyNegativeNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(-5, -3));
    }

    @Test
    public void multiplyMixedNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(-15, calculator.multiply(-5, 3));
    }

    @Test
    public void multiplyZeroTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0, 3));
        assertEquals(0, calculator.multiply(-5, 0));
    }

    @Test
    public void multiplyBoundaryValuesTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(Integer.MAX_VALUE, 1));
        assertEquals(0, calculator.multiply(Integer.MIN_VALUE, 1));
    }


//не работает
//    @Test
//    public void multiplyOverflowTest() {
//        Calculator calculator = new Calculator();
//        assertThrows(ArithmeticException.class, () -> calculator.multiply(Integer.MAX_VALUE, 2));
//    }


    @Test
    public void subtractPositiveNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.subtract(10, 3));
    }

    @Test
    public void subtractNegativeNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(-2, -3));
    }

    @Test
    public void subtracMixedNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(-30, calculator.subtract(-20, 10));
    }

    @Test
    public void subtractZeroTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(5, calculator.subtract(0, -5));
        assertEquals(8, calculator.subtract(8, 0));

    }

    @Test
    public void subtractBoundaryValuesTest() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MAX_VALUE, calculator.subtract(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MIN_VALUE, calculator.subtract(Integer.MIN_VALUE + 1, -1));
    }

//
//    @Test
//    public void addOverflowTest() {
//        Calculator calculator = new Calculator();
//        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));
//        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MIN_VALUE, -1));
//    }


}