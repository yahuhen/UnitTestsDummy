import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleJUnitTest {

    @Test
    void testConstructorAndGetters() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        assertEquals(5.0, rectangle.getLength());
        assertEquals(3.0, rectangle.getWidth());
    }

    @Test
    void testSetLength() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        rectangle.setLength(10.0);

        assertEquals(10.0, rectangle.getLength());
    }

    @Test
    void testSetWidth() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        rectangle.setWidth(7.0);

        assertEquals(7.0, rectangle.getWidth());
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        assertEquals(15.0, rectangle.getArea());
    }
}