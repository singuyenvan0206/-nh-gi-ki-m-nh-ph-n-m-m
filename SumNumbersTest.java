import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumNumbersTest {

    @Test
    public void testSum() {
        int result = SumNumbers.sum(2, 3);
        assertEquals(5, result);
    }
}
