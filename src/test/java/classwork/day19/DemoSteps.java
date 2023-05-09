package classwork.day19;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoSteps {
    @Given("I open demoG7 site")
    public void iOpenDemoGSite() {
        System.out.println("Given print");
    }

    @When("I fill {string} in the form")
    public void iFillInTheForm(String text) {
        System.out.printf("When print %s", text);
    }

    @Then("I need to see something")
    public void iNeedToSeeSomething() {
        System.out.println("Then print");
        Assert.assertTrue(true);
    }
}
