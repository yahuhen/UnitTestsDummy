import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddCheckerJUnitTest {

    @Test
    void testCheckEvenNumber() {
        assertTrue(EvenOddChecker.check(8));
    }

    @Test
    void testCheckOddNumber() {
        assertFalse(EvenOddChecker.check(7));
    }
}