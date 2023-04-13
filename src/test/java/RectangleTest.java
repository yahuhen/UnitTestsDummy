import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    Rectangle rectangle = new Rectangle(3, 6);

    @Test
    public void getRectangleLenght() {
        Assert.assertEquals(3, rectangle.getLength(), 0.1);
    }

    @Test
    public void getRectangleWidth() {
        Assert.assertEquals(6, rectangle.getWidth(), 0.5);
    }

    @Test
    public void setRectangleLenght() {
        rectangle.setLength(8);
        Assert.assertEquals(8, rectangle.getLength(), 0.1);

    }

    @Test
    public void setRectangleWidht() {
        rectangle.setWidth(8.9);
        Assert.assertEquals(9, rectangle.getWidth(), 0.5);
    }

    @Test
    public void getRectangleArea() {
        Assert.assertEquals(18.0, rectangle.getArea(), 0.1);
    }

}
