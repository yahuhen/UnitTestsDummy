import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassworkDay15 {
    Calculator myCalc = new Calculator();

    @Test
    public void addTestPositivePositive1() {
        Assert.assertEquals("Add returned wrong result", 1, myCalc.add(1, 0));
    }
    @Test
    public void addTestPositivePositive2() {
        Assert.assertEquals("Add returned wrong result", 1, myCalc.add(0, 1));
    }
    int expected;
    int x;
    int y;

    public ClassworkDay15(int expected, int x, int y) {
        this.expected = expected;
        this.x = x;
        this.y = y;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        return Arrays.asList(new Object[][]{
                {0,1},
                {1,0}
        });
    }

    @Test
    public void addTestPositivePositiveWithParameters() {
        Assert.assertEquals("Add returned wrong result", expected, myCalc.add(x, y));
    }

}
