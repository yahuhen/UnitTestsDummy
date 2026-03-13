import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTestNGTest {

    @Test
    public void testConstructorAndGetters() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        assertEquals(rectangle.getLength(), 5.0);
        assertEquals(rectangle.getWidth(), 3.0);
    }

    @Test
    public void testSetLength() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        rectangle.setLength(10.0);

        assertEquals(rectangle.getLength(), 10.0);
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        rectangle.setWidth(7.0);

        assertEquals(rectangle.getWidth(), 7.0);
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        assertEquals(rectangle.getArea(), 15.0);
    }
}