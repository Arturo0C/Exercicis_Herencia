import static org.junit.Assert.*;

public class ShapeTest {
    @org.junit.Test
    public void getColor() {
        Shape s = new Shape("blue",true);
        assertEquals("blue",s.getColor());
    }

    @org.junit.Test
    public void isFilled() {
        Shape s = new Shape("blue",true);
        assertEquals(true,s.isFilled());
    }

    @org.junit.Test
    public void testToString() {
        Shape s = new Shape("blue",true);
        assertEquals("Square{side=2.0}",s.toString());
    }
}
