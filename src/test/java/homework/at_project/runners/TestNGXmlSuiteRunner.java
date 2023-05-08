package homework.at_project.runners;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.internal.Parser;

import java.io.IOException;
import java.util.List;

public class TestNGXmlSuiteRunner {

    public static void main(String[] args) throws IOException {
        final TestNG testNg = new TestNG(true);
        final Parser parser = new Parser(
                "D:\\sasha\\AQA Java\\GIT_AT_G7\\alexander_kapylov_maven_at_project\\src\\test\\resources\\testng\\booking.xml"
        );
        final List<XmlSuite> suites = parser.parseToList();
        testNg.setXmlSuites(suites);
        testNg.run();
    }

}
