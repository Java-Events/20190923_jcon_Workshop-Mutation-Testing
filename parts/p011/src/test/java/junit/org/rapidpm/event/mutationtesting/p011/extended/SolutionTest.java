package junit.org.rapidpm.event.mutationtesting.p011.extended;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.Solution;

@Disabled
public class SolutionTest {
  @Test
  void test001() {
    String[] result = new Solution().discardCommonPrefix("ABC", "ABD");

    assertEquals(result[0], "C");
    assertEquals(result[1], "D");
  }

  @Test
  void test002() {
    String[] result = new Solution().discardCommonPrefix("ABC", "DEF");

    assertEquals(result[0], "ABC");
    assertEquals(result[1], "DEF");
  }

  @Test
  void test003() {
    String[] result = new Solution().discardCommonPrefix("DEF", "ABC");

    assertEquals(result[0], "DEF");
    assertEquals(result[1], "ABC");
  }

  @Test
  void test004() {
    String[] result = new Solution().discardCommonPrefix("ABD", "ABC");

    assertEquals(result[0], "D");
    assertEquals(result[1], "C");
  }

  @Test
  void test005() {
    String[] result = new Solution().discardCommonPrefix("", "ABC");

    assertEquals(result[0], "");
    assertEquals(result[1], "ABC");
  }

  @Test
  void test006() {
    String[] result = new Solution().discardCommonPrefix("", "");

    assertEquals(result[0], "");
    assertEquals(result[1], "");
  }

  @Test
  void test007() {
    String[] result = new Solution().discardCommonPrefix("ABC", "ABC");

    assertEquals(result[0], "");
    assertEquals(result[1], "");
  }
}
