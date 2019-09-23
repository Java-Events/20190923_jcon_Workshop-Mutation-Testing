package junit.org.rapidpm.event.mutationtesting.p002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p002.Service;

/**
 * Create the best test coverage you can for this
 */
class ServiceTest {

    // Cases: a < b, a >= b
    // Case: Loop count <= 0, > 0

  @Test
  void test00NegativeCount() {
    final Service service = new Service();
    Assertions.assertEquals(0, service.tuWas(1,1, -1));
  }

  @Test
  void testZeroCount() {
    final Service service = new Service();
      Assertions.assertEquals(0, service.tuWas(1,1, 0));
  }

    @Test
    void testAsmaller1() {
        final Service service = new Service();
        Assertions.assertEquals(-7, service.tuWas(5,6, 2));
    }

    @Test
    void testAbigger1() {
        final Service service = new Service();
        Assertions.assertEquals(23, service.tuWas(6,5, 2));
    }

}
