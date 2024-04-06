import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorJUnitTests {

    @Test
    public void testSumPositive() {
        Calculator calculator = new Calculator();

        // Проверка результата сложения двух положительных чисел

        int result = calculator.add(10, 40);
        assertEquals(50, result);
    }

    @Test
    public void testSumPositiveAndNegative() {
        Calculator calculator = new Calculator();
        // Проверка результата сложения отрицательного и положительного числа

        int result = calculator.add(-5, 10);
        assertEquals(5, result);
    }

    @Test
    public void testSumNegative() {
        Calculator calculator = new Calculator();

        // Проверка результата сложения двух отрицательных чисел

        int result = calculator.add(-8, -2);
        assertEquals(-10, result);
    }

    @Test
    public void testSubtractPositive() {
        Calculator calculator = new Calculator();

        // Проверка результата вычитания двух положительных чисел

        int result = calculator.subtract(100, 40);
        assertEquals(60, result);
    }

    @Test
    public void testSubtractNegative() {
        Calculator calculator = new Calculator();

        // Проверка результата вычитания двух положительных чисел

        int result = calculator.subtract(-100, -40);
        assertEquals(-60, result);
    }

    @Test
    public void testSubtractPositiveAndNegative() {
        Calculator calculator = new Calculator();

        // Проверка результата вычитания двух положительных чисел

        int result = calculator.subtract(100, -40);
        assertEquals(140, result);
    }

    @Test
    public void testMultiplyPositiveAndNegative() {
        Calculator calculator = new Calculator();

        // Проверка результата умножения двух положительных чисел

        int result = calculator.multiply(-3, 4);
        assertEquals(-12, result);
    }

    @Test
    public void testMultiplyPositive() {
        Calculator calculator = new Calculator();

        // Проверка результата умножения двух положительных чисел

        int result = calculator.multiply(30, 3);
        assertEquals(90, result);
    }
    @Test
    public void testMultiplyNegative() {
        Calculator calculator = new Calculator();

        // Проверка результата умножения двух положительных чисел

        int result = calculator.multiply(-30, -1);
        assertEquals(30, result);
    }
    @Test
    public void testDivideNegative() {
        Calculator calculator = new Calculator();

        // Проверка результата деления двух положительных чисел

        int result = calculator.divide(-30, -5);
        assertEquals(6, result);
    }
    @Test
    public void testDividePositive() {
        Calculator calculator = new Calculator();

        // Проверка результата деления двух положительных чисел

        int result = calculator.divide(30, 5);
        assertEquals(6, result);
    }
}
