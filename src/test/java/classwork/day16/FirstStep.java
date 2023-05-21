package classwork.day16;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FirstStep {
    @Given("I open first site")
    public void iOpenFirstSite() {
        System.out.println("I open site");
    }

    @When("I fill {string} as name of first site")
    public void iFillAsNameOfFirstSite(String text) {
        System.out.printf("I fill '%s' name site", text);
    }

    @Then("I need to see site")
    public void iNeedToSeeSite() {
        Assert.assertTrue(true);
        System.out.println("I see site");
    }
}
