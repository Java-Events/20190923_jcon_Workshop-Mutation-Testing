package junit.org.rapidpm.event.mutationtesting.p002;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p002.Service;

import static org.junit.Assert.assertEquals;

/**
 * Create the best test coverage you can for this
 */
class ServiceTest {

  @Test
  void test001() {
    //start here...
    final Service service = new Service();

    final int result = service.add(1, 1);

    assertEquals(-2, result);
  }

  @Test
  void test002() {
    final Service service = new Service();

    final int result = service.add(2, 0);

    assertEquals(2, result);
  }

}
