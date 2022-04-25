import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    // @Test
    // public void subtraction() {
    //     assertEquals(7, 17 - 10);
    // }

    @Test
    public void testMarkdownParse() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);

        assertEquals("The two links should be printed", List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }
}