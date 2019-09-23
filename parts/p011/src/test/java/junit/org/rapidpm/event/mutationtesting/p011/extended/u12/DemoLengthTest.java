package junit.org.rapidpm.event.mutationtesting.p011.extended.u12;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.u12.DemoLength;

import static org.junit.Assert.assertEquals;

class DemoLengthTest {

    @Test
    void firstIsShorter() {
        final int length = DemoLength.length("123", "12345");

        assertEquals(3, length);
    }

    @Test
    void secondIsShorter() {
        final int length = DemoLength.length("12345", "123");

        assertEquals(3, length);
    }

    @Test
    void sameLength() {
        final int length = DemoLength.length("123", "123");

        assertEquals(3, length);
    }
}
