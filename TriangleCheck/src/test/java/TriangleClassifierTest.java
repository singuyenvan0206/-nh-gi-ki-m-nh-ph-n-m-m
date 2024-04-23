import org.example.TriangleClassifier;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        assertTrue(TriangleClassifier.isTriangle(3, 3, 3));
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertTrue(TriangleClassifier.isTriangle(5, 5, 3));
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 5, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertTrue(TriangleClassifier.isTriangle(3, 4, 5));
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertFalse(TriangleClassifier.isTriangle(1, 2, 5));
        assertEquals("NotATriangle", TriangleClassifier.classifyTriangle(1, 2, 5));
    }
}
