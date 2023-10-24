import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {
	@Test 
	public void testFilter() {
        ArrayList<String> input = new ArrayList<>();
        input.add("Hellewfo");
        input.add("Hi");
        input.add("okay");
        StringChecker s = new StringChecker() {
            public boolean checkString(String s) {
                return s.length() < 5;
            }
        };
        ArrayList<String> answer = new ArrayList<>();
        answer.add("Hi");
        answer.add("okay");

        assertEquals(answer, ListExamples.filter(input, s));
    }

    @Test 
	public void testMerge() {
        ArrayList<String> input = new ArrayList<>();
        input.add("a");
        input.add("d");
        input.add("z");

        ArrayList<String> input2 = new ArrayList<>();
        input2.add("b");
        input2.add("c");

        ArrayList<String> answer = new ArrayList<>();
        answer.add("a");
        answer.add("b");
        answer.add("c");
        answer.add("d");
        answer.add("z");

        assertEquals(answer, ListExamples.merge(input, input2));
    }

    @Test 
	public void testMerge2() {
        ArrayList<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");

        ArrayList<String> input2 = new ArrayList<>();
        input2.add("c");
        input2.add("d");

        ArrayList<String> answer = new ArrayList<>();
        answer.add("a");
        answer.add("b");
        answer.add("c");
        answer.add("d");

        assertEquals(answer, ListExamples.merge(input, input2));
    }
}