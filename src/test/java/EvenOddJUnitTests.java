import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOddJUnitTests {

    @Test
    public void testOdd() {

        boolean result = EvenOddChecker.check(5);
        assertEquals(result, false);
    }

    @Test
    public void testEven() {

        boolean result = EvenOddChecker.check(6);
        assertEquals(result, true);
    }

}

