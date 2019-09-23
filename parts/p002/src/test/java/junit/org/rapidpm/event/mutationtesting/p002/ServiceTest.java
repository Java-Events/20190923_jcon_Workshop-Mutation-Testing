package junit.org.rapidpm.event.mutationtesting.p002;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p002.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Create the best test coverage you can for this
 */
class ServiceTest {

  @Test
  void test001() {
    final Service service = new Service();
    assertEquals(-1, service.add(0,1));
  }

  @Test
  void test002() {
    final Service service = new Service();
    assertEquals(3, service.add(2,1));
  }
}
