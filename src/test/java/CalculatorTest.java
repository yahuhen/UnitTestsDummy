import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void CalculatorAddTest() {
        Assert.assertEquals("Addition returned wrong result: ", 2147483647, calculator.add(1, 2147483646));
        Assert.assertEquals("Addition returned wrong result: ", 2147483646, calculator.add(1, 2147483645));
        Assert.assertEquals("Addition returned wrong result: ", 0, calculator.add(0, 0));
        Assert.assertEquals("Addition returned wrong result: ", 0, calculator.add(-2147483647, 2147483647));
        Assert.assertEquals("Addition returned wrong result: ", -2147483648, calculator.add(-1, -2147483647));
        Assert.assertEquals("Addition returned wrong result: ", -2147483647, calculator.add(-1, -2147483646));
    }

    @Test
    public void CalculatorSubtractTest() {
        Assert.assertEquals("Addition returned wrong result: ", 1, calculator.subtract(2147483647, 2147483646));
        Assert.assertEquals("Addition returned wrong result: ", 1, calculator.subtract(2147483646, 2147483645));
        Assert.assertEquals("Addition returned wrong result: ", 0, calculator.subtract(0, 0));
        Assert.assertEquals("Addition returned wrong result: ", 0, calculator.subtract(2147483647, 2147483647));
        Assert.assertEquals("Addition returned wrong result: ", 0, calculator.subtract(-2147483647, -2147483647));
        Assert.assertEquals("Addition returned wrong result: ", -1, calculator.subtract(2147483646, 2147483647));
        Assert.assertEquals("Addition returned wrong result: ", -1, calculator.subtract(2147483645, 2147483646));
        Assert.assertEquals("Addition returned wrong result: ", -1, calculator.subtract(2147483647, -2147483648));
    }

    @Test
    public void CalculatorMultiplyTest() {
        Assert.assertEquals("Addition returned wrong result: ", 2147483647, calculator.multiply(1, 2147483647));
        Assert.assertEquals("Addition returned wrong result: ", 2147483646, calculator.multiply(1, 2147483646));
        Assert.assertEquals("Addition returned wrong result: ", 0, calculator.multiply(0, 0));
        Assert.assertEquals("Addition returned wrong result: ", 0, calculator.multiply(2147483647, 0));
        Assert.assertEquals("Addition returned wrong result: ", -2147483648, calculator.multiply(-1, -2147483648));
        Assert.assertEquals("Addition returned wrong result: ", -2147483647, calculator.multiply(-1, -2147483647));
    }

    @Test
    public void CalculatorDivideTest() {
        Assert.assertEquals("Addition returned wrong result: ", 1, calculator.divide(2147483647, 2147483647));
        Assert.assertEquals("Addition returned wrong result: ", 1, calculator.divide(2147483646, 2147483646));
        Assert.assertEquals("Addition returned wrong result: ", 0, calculator.divide(0, 2147483647));
        Assert.assertEquals("Addition returned wrong result: ", 1, calculator.divide(-2147483648, -2147483648));
    }
}