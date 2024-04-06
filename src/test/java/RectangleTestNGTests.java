import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTestNGTests {

    @Test
    public void testConstructor() {
        Rectangle rectangle = new Rectangle(6.6546456, 8.8273846);
        assertEquals(6.6546456, rectangle.length, 0);
        assertEquals(8.8273846, rectangle.width, 0);
    }

    @Test
    public void testGetterLength() {
        Rectangle rectangle = new Rectangle(6.6546456, 8.8273846);
        assertEquals(6.6546456, rectangle.getLength(), 0);
    }

    @Test
    public void testGetterWeight() {
        Rectangle rectangle = new Rectangle(6.6546456, 8.8273846);
        assertEquals(8.8273846, rectangle.getWidth(), 0);
    }
}





