package homework.day14;

import homework.day14.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTests {

    Rectangle myRectangle = new Rectangle(1.5, 0.1);

    @Test
    public void testGetLength() {
        Assert.assertEquals(1.5, myRectangle.getLength(), 0.00000001);
    }

    @Test
    public void testGetWidth() {
        Assert.assertEquals(0.1, myRectangle.getWidth(), 0.00000001);
    }

    @Test
    public void testSetLength() {
        myRectangle.setLength(0.0);
        Assert.assertEquals(0.0, myRectangle.getLength(), 0.00000001);
    }

    @Test
    public void testSetWidth() {
        myRectangle.setWidth(-999999999999999.9999);
        Assert.assertEquals(-999999999999999.9999, myRectangle.getWidth(), 0.00000001);
    }

    @Test
    public void testGetArea() {
        myRectangle.setWidth(-0.1);
        Assert.assertEquals(-0.15, myRectangle.getArea(), 0.00000001);
    }

}
