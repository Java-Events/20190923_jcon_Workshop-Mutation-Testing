package junit.org.rapidpm.event.mutationtesting.p002;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p002.Service;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Create the best test coverage you can for this
 */
class ServiceTest {

  @Test
  void test001() {
    final Service service = new Service();
    assertEquals(-2, service.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
  }

  @Test
  void test002() {
    final Service service = new Service();
    assertEquals(1, service.add(Integer.MIN_VALUE, Integer.MAX_VALUE));
  }
}
