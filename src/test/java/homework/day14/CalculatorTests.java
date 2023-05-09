package homework.day14;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    Calculator myCalc = new Calculator();

    @Test
    public void addTestPositivePositive() {
        Assert.assertEquals("Add returned wrong result", 1999999998, myCalc.add(999999999, 999999999));
    }

    @Test
    public void addTestPositiveNegative() {
        Assert.assertEquals("Add returned wrong result", 0, myCalc.add(2, -2));
    }

    @Test
    public void addTestPositiveZero() {
        Assert.assertEquals("Add returned wrong result", 1, myCalc.add(1, 0));
    }

    @Test
    public void addTestZeroPositive() {
        Assert.assertEquals("Add returned wrong result", 999999999, myCalc.add(0, 999999999));
    }

    @Test
    public void addTestZeroZero() {
        Assert.assertEquals("Add returned wrong result", 0, myCalc.add(0, 0));
    }

    @Test
    public void addTestZeroNegative() {
        Assert.assertEquals("Add returned wrong result", -999999999, myCalc.add(0, -999999999));
    }

    @Test
    public void addTestNegativePositive() {
        Assert.assertEquals("Add returned wrong result", 0, myCalc.add(-999999999, 999999999));
    }

    @Test
    public void addTestNegativeNegative() {
        Assert.assertEquals("Add returned wrong result", -1999999998, myCalc.add(-999999999, -999999999));
    }

    @Test
    public void addTestNegativeZero() {
        Assert.assertEquals("Add returned wrong result", -1, myCalc.add(-1, 0));
    }

    @Test
    public void subtractTestPositivePositive() {
        Assert.assertEquals("Subtract returned wrong result", 0, myCalc.subtract(999999999, 999999999));
    }

    @Test
    public void subtractTestPositiveNegative() {
        Assert.assertEquals("Subtract returned wrong result", 4, myCalc.subtract(2, -2));
    }

    @Test
    public void subtractTestPositiveZero() {
        Assert.assertEquals("Subtract returned wrong result", 1, myCalc.subtract(1, 0));
    }

    @Test
    public void subtractTestZeroPositive() {
        Assert.assertEquals("Subtract returned wrong result", -999999999, myCalc.subtract(0, 999999999));
    }

    @Test
    public void subtractTestZeroZero() {
        Assert.assertEquals("Subtract returned wrong result", 0, myCalc.subtract(0, 0));
    }

    @Test
    public void subtractTestZeroNegative() {
        Assert.assertEquals("Subtract returned wrong result", 999999999, myCalc.subtract(0, -999999999));
    }

    @Test
    public void subtractTestNegativePositive() {
        Assert.assertEquals("Subtract returned wrong result", -1999999998, myCalc.subtract(-999999999, 999999999));
    }

    @Test
    public void subtractTestNegativeNegative() {
        Assert.assertEquals("Subtract returned wrong result", 0, myCalc.subtract(-999999999, -999999999));
    }

    @Test
    public void subtractTestNegativeZero() {
        Assert.assertEquals("Subtract returned wrong result", -1, myCalc.subtract(-1, 0));
    }

        @Test
    public void multiplyTestPositivePositive(){
        Assert.assertEquals("Multiply returned wrong result",50,myCalc.multiply(5,10));
    }
    @Test
    public void multiplyTestPositiveNegative() {
        Assert.assertEquals("Multiply returned wrong result", -4, myCalc.multiply(2, -2));
    }

    @Test
    public void multiplyTestPositiveZero() {
        Assert.assertEquals("Multiply returned wrong result", 0, myCalc.multiply(1, 0));
    }

    @Test
    public void multiplyTestZeroPositive() {
        Assert.assertEquals("Multiply returned wrong result", 0, myCalc.multiply(0, 999999999));
    }

    @Test
    public void multiplyTestZeroZero() {
        Assert.assertEquals("Multiply returned wrong result", 0, myCalc.multiply(0, 0));
    }

    @Test
    public void multiplyTestZeroNegative() {
        Assert.assertEquals("Multiply returned wrong result", 0, myCalc.multiply(0, -999999999));
    }

        @Test
    public void multiplyTestNegativePositive(){
        Assert.assertEquals("Subtract returned wrong result",-2,myCalc.multiply(-1,2));
    }
    @Test
    public void multiplyTestNegativeNegative(){
        Assert.assertEquals("Subtract returned wrong result",4,myCalc.multiply(-2,-2));
    }
    @Test
    public void multiplyTestNegativeZero(){
        Assert.assertEquals("Subtract returned wrong result",0,myCalc.multiply(-1,0));
    }
    @Test
    public void divideTestPositivePositive() {
        Assert.assertEquals("Divide returned wrong result", 1, myCalc.divide(999999999, 999999999));
    }

    @Test
    public void divideTestPositiveNegative() {
        Assert.assertEquals("Divide returned wrong result", -1, myCalc.divide(2, -2));
    }

        @Test(expected = ArithmeticException.class)
    public void divideTestPositiveZero(){
        myCalc.divide(1,0);
    }
    @Test
    public void divideTestZeroPositive() {
        Assert.assertEquals("Divide returned wrong result", 0, myCalc.divide(0, 999999999));
    }

        @Test(expected = ArithmeticException.class)
    public void divideTestZeroZero(){
        myCalc.divide(0,0);
    }
    @Test
    public void divideTestZeroNegative() {
        Assert.assertEquals("Divide returned wrong result", 0, myCalc.divide(0, -999999999));
    }

    @Test
    public void divideTestNegativePositive() {
        Assert.assertEquals("Divide returned wrong result", -1, myCalc.divide(-999999999, 999999999));
    }

    @Test
    public void divideTestNegativeNegative() {
        Assert.assertEquals("Divide returned wrong result", 1, myCalc.divide(-999999999, -999999999));
    }

        @Test(expected = ArithmeticException.class)
    public void divideTestNegativeZero(){
        myCalc.divide(-1,0);
    }

}
