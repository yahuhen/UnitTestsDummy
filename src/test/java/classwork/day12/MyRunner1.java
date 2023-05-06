package classwork.day12;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) //запускаем только определенные классы
@Suite.SuiteClasses({
        CalcTests.class,
        CheckerTest.class
})
public class MyRunner1 {
}
