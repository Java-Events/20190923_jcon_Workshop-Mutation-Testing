package junit.org.rapidpm.event.mutationtesting.p011.extended.u05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.Service;

/**
 * Case: length a < b , a > b , a == b
 * Case: No common prefix, some prefix, a.equals(b)
 *
 * Different length, Different prefixes
 *
 */
public class TestService {
    final static String EMPTY_STRING = "";

    @Test
    void testEqualStrings() {
        String string = "ABC";
        String[] result = Service.discardCommonPrefix(string, string);
        Assertions.assertEquals(EMPTY_STRING, result[0]);
        Assertions.assertEquals(EMPTY_STRING, result[1]);
    }

    @Test
    void testNoCommonPrefix1() {
        String stringA = "A";
        String stringB = "B";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals("A", result[0]);
        Assertions.assertEquals("B", result[1]);
    }

    @Test
    void testNoCommonPrefix2() {
        String stringA = "AA";
        String stringB = "BB";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals("AA", result[0]);
        Assertions.assertEquals("BB", result[1]);
    }

    @Test
    void testNonEqualStrings() {
        String stringA = "ABCD";
        String stringB = "ABDD";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals("CD", result[0]);
        Assertions.assertEquals("DD", result[1]);
    }

    @Test
    void testNonEqualStringsLengthB() {
        String stringA = "ABCD";
        String stringB = "ABDDE";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals("CD", result[0]);
        Assertions.assertEquals("DDE", result[1]);
    }

    @Test
    void testNonEqualStringsLengthA() {
        String stringA = "ABCDE";
        String stringB = "ABDD";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals("CDE", result[0]);
        Assertions.assertEquals("DD", result[1]);
    }

    @Test
    void testAAlonger() {
        String stringA = "AABB";
        String stringB = "AA";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals("BB", result[0]);
        Assertions.assertEquals("", result[1]);
    }

    @Test
    void testBBlonger() {
        String stringA = "AA";
        String stringB = "AABB";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals("", result[0]);
        Assertions.assertEquals("BB", result[1]);
    }

    @Test
    void testAshorter() {
        String stringA = "ABC";
        String stringB = stringA + "+-";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals(EMPTY_STRING, result[0]);
        Assertions.assertEquals("+-", result[1]);
    }

    @Test
    void testBshorter() {
        String stringB = "ABC";
        String stringA = stringB + "+-";
        String[] result = Service.discardCommonPrefix(stringA, stringB);
        Assertions.assertEquals(EMPTY_STRING, result[1]);
        Assertions.assertEquals("+-", result[0]);
    }
}
