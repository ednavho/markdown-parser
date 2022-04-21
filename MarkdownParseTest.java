import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    @Test //tells program that this will be a test
    public void addition() {
        assertEquals(2, 1 + 1); //before comma is expected result and right is actual
    }

    @Test
    public void getLinksFromFile1() throws IOException{
        Path fileName = Path.of(test-file.md);
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://something.com");
        links.add("some-thing.html");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    /*@Test
    public void getLinksFromFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://something.com");
        links.add("some-thing.html");
        links.add("");
        links.add("https://google.com");
        assertEquals(links, MarkdownParse.getLinks(content));
    }*/
    
    
}
