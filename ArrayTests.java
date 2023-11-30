import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testSort() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.sort(input1));
  }

  @Test
  public void testSort1() {
    int[] input1 = { 3, 4, 5};
    assertArrayEquals(new int[]{ 3, 4, 5 }, ArrayExamples.sort(input1));
  }

  @Test
  public void testSort2() {
    int[] input1 = { 5, 4, 3};
    assertArrayEquals(new int[]{ 3, 4, 5 }, ArrayExamples.sort(input1));
  }

 @Test
  public void testSort3() {
    int[] input1 = { 5, 3, 4};
    assertArrayEquals(new int[]{ 3, 4, 5 }, ArrayExamples.sort(input1));
  }
}
