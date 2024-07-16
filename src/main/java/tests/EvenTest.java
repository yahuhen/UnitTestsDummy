import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {

    @Test
    public void test() {
        EvenOddChecker num = new EvenOddChecker();
        assertEquals(true, num.check(2));
        assertEquals(false, num.check(3));
        assertEquals(true, num.check(0));
    }

}
