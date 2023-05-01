package classwork.day16;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},  //плагины для выполнения каких-то действий, отчетов
        glue = {"classwork.day16"}, //пакеты добавляем, в которые нужно задействовать
        features = {"src/test/resources/features/second.feature",
                "src/test/resources/features/test.feature"},
        tags = "@QA"
)
public class RunnerSteps {
}
