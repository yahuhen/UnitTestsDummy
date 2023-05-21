package homework.day15.runners;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.internal.Parser;

import java.io.IOException;
import java.util.List;

public class TestNGYamlRunner {
    public static void main(String[] args) throws IOException {
        final TestNG testNg = new TestNG(true);
        final Parser parser = new Parser(
                "src/test/resources/testng/testng.yaml"
        );
        final List<XmlSuite> suites = parser.parseToList();
        testNg.setXmlSuites(suites);
        testNg.run();
    }
}
