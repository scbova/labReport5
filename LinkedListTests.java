import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
	@Test 
	public void testEmptyList() {
        LinkedList input = new LinkedList();
        assertEquals("", input.toString());
    }

    @Test 
	public void testPrepend() {
        LinkedList input = new LinkedList();
        input.prepend(1);
        input.prepend(2);

        
        assertEquals("2 1 ", input.toString());
    }

    @Test 
	public void testAppend() {
        LinkedList input = new LinkedList();
        input.append(1);
        input.append(2);
        assertEquals("1 2 ", input.toString());
    }

    @Test 
	public void testFirst() {
        LinkedList input = new LinkedList();
        input.append(1);
        input.append(2);
        assertEquals(1, input.first());
    }

    @Test 
	public void testLast() {
        LinkedList input = new LinkedList();
        input.append(1);
        input.append(2);
        assertEquals(2, input.last());
    }

    @Test 
	public void testLength() {
        LinkedList input = new LinkedList();
        input.append(1);
        input.append(2);
        assertEquals(2, input.length());
    }

    @Test 
	public void testDifferentMethods() {
        LinkedList input = new LinkedList();
        input.append(1);
        input.append(2);
        input.prepend(0);
        input.append(4);
        input.prepend(1);
        assertEquals("1 0 1 2 4 ", input.toString());
    }
}
