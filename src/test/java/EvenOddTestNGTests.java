import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOddTestNGTests {
    @Test
    public void testOdd() {

        boolean result = EvenOddChecker.check(5);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testEven() {

        boolean result = EvenOddChecker.check(6);
        Assert.assertEquals(result, true);
    }

}

