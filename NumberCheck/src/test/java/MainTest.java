import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testEvenNumber() {
        String input = "4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "Nhập một số nguyên: \n" +
                "Số 4 là số chẵn.\n" +
                "In ra các số từ 1 đến 4: \n" +
                "1 2 3 4 ";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testOddNumber() {
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "Nhập một số nguyên: \n" +
                "Số 5 là số lẻ.\n" +
                "In ra các số từ 1 đến 5: \n" +
                "1 2 3 4 5 ";
        assertEquals(expectedOutput, outContent.toString());
    }
}
