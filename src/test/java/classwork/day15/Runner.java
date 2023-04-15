package classwork.day15;

import homework.day14.CalculatorTests;
import homework.day14.EvenOddCheckerTests;
import homework.day14.RectangleTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTests.class, EvenOddCheckerTests.class, RectangleTests.class})
public class Runner {
}
