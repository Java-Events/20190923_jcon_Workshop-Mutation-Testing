package junit.org.rapidpm.event.mutationtesting.p011.extended.u07;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.Service;
import org.rapidpm.event.mutationtesting.p011.extended.u07.ServiceU07;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceTest {
    @Test
    void test001() {
        String[] result = Service.discardCommonPrefix("A", "");
        assertEquals(result[0], "A");
        assertEquals(result[1], "");
    }

    @Test
    void test002() {
        String[] result = Service.discardCommonPrefix("ABC", "AC");
        assertEquals(result[0], "BC");
        assertEquals(result[1], "C");
    }
}
