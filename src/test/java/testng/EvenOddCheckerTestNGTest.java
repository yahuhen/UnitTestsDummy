import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EvenOddCheckerTestNGTest {

    @Test
    public void testCheckEvenNumber() {
        assertTrue(EvenOddChecker.check(8));
    }

    @Test
    public void testCheckOddNumber() {
        assertFalse(EvenOddChecker.check(7));
    }
}