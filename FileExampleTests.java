import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class FileExampleTests {
	@Test 
	public void testSimpleGetFiles() throws IOException {
        ArrayList<File> ans = new ArrayList<>();
        ans.add(new File("someStuff/a.txt"));

        assertEquals(ans, FileExample.getFiles(new File("someStuff/a.txt")));
    }
    
    @Test 
	public void testGetFiles() throws IOException {
        ArrayList<File> ans = new ArrayList<>();
        ans.add(new File("someStuff/otherStuff/kk.txt"));
        ans.add(new File("someStuff/otherStuff/what.txt"));
        ans.add(new File("someStuff/a.txt"));
        ans.add(new File("someStuff/b.txt"));

        assertEquals(ans, FileExample.getFiles(new File("someStuff/")));
    }
    
}
