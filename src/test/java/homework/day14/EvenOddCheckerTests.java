package homework.day14;

import homework.day14.EvenOddChecker;
import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTests {

    @Test
    public void checkTestTrue() {
        Assert.assertTrue("check returned wrong result", EvenOddChecker.check(100));
    }

    @Test
    public void checkTestFalse() {
        Assert.assertFalse("check returned wrong result", EvenOddChecker.check(11));
    }

}
