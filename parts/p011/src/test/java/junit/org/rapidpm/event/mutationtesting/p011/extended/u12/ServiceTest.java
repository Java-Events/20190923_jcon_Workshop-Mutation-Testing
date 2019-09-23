/*
 * (c) Copyright 2019 codecentric AG
 */
package junit.org.rapidpm.event.mutationtesting.p011.extended.u12;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServiceTest {

    @Test
    void firstStringIsNullThrowsNPE() {
        assertThrows(NullPointerException.class, () -> {
            final String[] strings = Service.discardCommonPrefix(null, "");
        });
    }
    @Test
    void secondStringIsNullThrowsNPE() {

        assertThrows(NullPointerException.class, () -> {
            final String[] strings = Service.discardCommonPrefix("", null);
        });
    }

    @Test
    void twoEmptyStrings() {
        String[] result = Service.discardCommonPrefix("", "");

        assertEquals(2, result.length);
        assertEquals("", result[0]);
        assertEquals("", result[1]);
    }

    @Test
    void twoSameStrings() {
        String[] result = Service.discardCommonPrefix("abc", "abc");

        assertEquals(2, result.length);
        assertEquals("", result[0]);
        assertEquals("", result[1]);
    }

    @Test
    void firstIsSubstringOfSecond() {
        String[] result = Service.discardCommonPrefix("abc", "abcdef");

        assertEquals(2, result.length);
        assertEquals("", result[0]);
        assertEquals("def", result[1]);
    }
    @Test
    void secondIsSubstringOfFirst() {
        String[] result = Service.discardCommonPrefix("abcdef", "abc");

        assertEquals(2, result.length);
        assertEquals("def", result[0]);
        assertEquals("", result[1]);
    }

    @Test
    void commonPrefix() {
        String[] result = Service.discardCommonPrefix("abcdef", "abcghi");

        assertEquals(2, result.length);
        assertEquals("def", result[0]);
        assertEquals("ghi", result[1]);
    }

    @Test
    void firstIsEmpty() {
        String[] result = Service.discardCommonPrefix("", "abc");

        assertEquals(2, result.length);
        assertEquals("", result[0]);
        assertEquals("abc", result[1]);
    }

    @Test
    void secondIsEmpty() {
        String[] result = Service.discardCommonPrefix("abc", "");

        assertEquals(2, result.length);
        assertEquals("abc", result[0]);
        assertEquals("", result[1]);
    }

    @Test
    void noCommonPrefix() {
        String[] result = Service.discardCommonPrefix("abc", "def");

        assertEquals(2, result.length);
        assertEquals("abc", result[0]);
        assertEquals("def", result[1]);
    }

}
