import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

  @Test
  public void testSort1() {
    int[] input1 = { 3, 4, 5};
    assertArrayEquals(new int[]{ 3, 4, 5 }, ArraySort.sort(input1));
  }
}
