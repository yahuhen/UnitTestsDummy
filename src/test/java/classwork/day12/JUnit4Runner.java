package classwork.day12;

import homework.day12.RectangleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) //запускаем только определенные классы
@Suite.SuiteClasses({
        CalcTests.class,
        CheckerTest.class,
        homework.day12.CalcTests.class,
        homework.day12.CheckerTest.class,
        RectangleTest.class
})
public class JUnit4Runner {


}

//или в pom в билд добавляем  инклудс
//<configuration>
//                    <includes>
//                        <include>homework.day12.CalcTests.class</include>
//                        <include>homework.day12.CheckerTest.class</include>
//                        <include>homework.day12.RectangleTest.class</include>
//                    </includes>
//                </configuration>


//<include>${MyRunnerArg}</include>
//mvn test "-DMyRunnerArg=MyRunner1.class"
