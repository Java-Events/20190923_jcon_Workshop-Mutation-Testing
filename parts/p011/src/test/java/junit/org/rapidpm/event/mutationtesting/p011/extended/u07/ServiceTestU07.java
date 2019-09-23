package junit.org.rapidpm.event.mutationtesting.p011.extended.u07;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.u07.ServiceU07;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceTestU07 {
    @Test
    void test001() {
        String[] result = ServiceU07.discardCommonPrefix("A", "");
        assertEquals(result[0], "A");
        assertEquals(result[1], "");
    }

    @Test
    void test002() {
        String[] result = new ServiceU07().discardCommonPrefix("ABC", "AC");
        assertEquals(result[0], "BC");
        assertEquals(result[1], "C");
    }
}
