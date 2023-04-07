import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {

    EvenOddChecker evenOddChecker = new EvenOddChecker();

    @Test
    public void EvenOddCheckerTestOne() {
        Assert.assertTrue(evenOddChecker.check(2147483646));
        Assert.assertTrue(evenOddChecker.check(-2147483648));
        Assert.assertTrue(evenOddChecker.check(0));
    }

    @Test
    public void EvenOddCheckerTestTwo() {
        Assert.assertFalse(evenOddChecker.check(2147483647));
        Assert.assertFalse(evenOddChecker.check(-2147483647));
        Assert.assertFalse(evenOddChecker.check(-1));
    }
}
