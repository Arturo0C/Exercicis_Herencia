import org.junit.Test;

import static org.junit.Assert.*;

public class CircleEx3Test {
    @Test
    public void getRadius() {
        CircleEx3 c = new CircleEx3(4,"blue",true);
        assertEquals(4,c.getRadius(),4);
    }

    @Test
    public void getArea() {
        CircleEx3 c = new CircleEx3(4,"blue",true);
        assertEquals(50.27,c.getRadius(),50);
    }

    @Test
    public void getPerimeter() {
        CircleEx3 c = new CircleEx3(4,"blue",true);
        assertEquals(25.13,c.getPerimeter(),25);
    }

    @Test
    public void testToString() {
        CircleEx3 c = new CircleEx3(4,"blue",true);
        assertEquals("CircleEx3{radius=4.0}", c.toString());
    }
}