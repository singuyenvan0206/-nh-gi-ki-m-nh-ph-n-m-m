import org.example.NextDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDateTest {
    @Test
    public void NextDateTest() {
        NextDate nextDate = new NextDate();

        // Test case: 1/1/2020 -> 2/1/2020
        assertEquals("Invalid date", nextDate.getNextDate(1, 1, 2020));

        // Test case: 31/12/2012 -> 1/1/2021
        assertEquals("21/12/2012", nextDate.getNextDate(20, 12, 2012));

        // Test case: 28/2/2012 (leap year) -> 29/2/2020
        assertEquals("29/2/2012", nextDate.getNextDate(28, 2, 2012));

        assertEquals("1/3/2010", nextDate.getNextDate(28, 2, 2010));
    }
}
