package classwork.day12;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalcTests {
    Calculator calculator = new Calculator();

    @Test
    public void myCalcAddTest() {
        Assert.assertEquals("Addition return wrong result: ", 4, calculator.add(2, 2));
    }

    @Test
    public void myCalcAddNegativeTest() {
        Assert.assertEquals("Addition return wrong result: ", -1, calculator.add(2, -3));
    }

    @Test
    public void myCalcAddZeroTest() {
        Assert.assertEquals("Addition return wrong result: ", 0, calculator.add(0, 0));
    }

    @Test
    public void myCalcSubtractTest() {
        Assert.assertEquals("Substract return wrong result: ", 0, calculator.subtract(2, 2));
    }

    @Test
    public void myCalcSubtractNegativeTest() {
        Assert.assertEquals("Substract return wrong result: ", -8, calculator.subtract(-3, 5));
    }

    @Test
    public void myCalcSubtractZeroTest() {
        Assert.assertEquals("Substract return wrong result: ", 0, calculator.subtract(0, 0));
    }

    @Test
    public void myCalcMultiplyTest() {
        Assert.assertEquals("Multiply return wrong result: ", 6, calculator.multiply(2, 3));
    }

    @Test
    public void myCalcMultiplyNegativeTest() {
        Assert.assertEquals("Multiply return wrong result: ", -6, calculator.multiply(-2, 3));
    }

    @Test
    public void myCalcMultiplyZeroTest() {
        Assert.assertEquals("Multiply return wrong result: ", 0, calculator.multiply(0, 0));
    }

    @Test
    public void myCalcDivideTest() {
        Assert.assertEquals("Divide return wrong result: ", 1, calculator.divide(2, 2));
    }

    @Test
    public void myCalcDivideNegativeTest() {
        Assert.assertEquals("Divide return wrong result: ", -2, calculator.divide(-8, 4));
    }

    @Test
    public void myCalcDivideZeroTest() {
        Assert.assertEquals("Divide return wrong result: ", 0, calculator.divide(0, 3));
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void myCalcDivideZeroTestt() {
        Assert.assertEquals("Divide return wrong result: ", 4, calculator.divide(3, 0));
    }

}
