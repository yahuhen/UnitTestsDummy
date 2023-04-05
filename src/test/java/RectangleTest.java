import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(3.01,4);
        Assert.assertEquals(4, rectangle.getWidth(), 0);
        Assert.assertEquals(3.01, rectangle.getLength(), 0);
        Assert.assertEquals(12.04, rectangle.getArea(), 0);
        rectangle.setWidth(5);
        Assert.assertEquals(5, rectangle.getWidth(), 0);
        Assert.assertEquals(15.05, rectangle.getArea(), 0.01); //шо за математика
        rectangle.setLength(5);
        Assert.assertEquals(5, rectangle.getLength(), 0);
        Assert.assertEquals(25, rectangle.getArea(), 0);
    }
}
