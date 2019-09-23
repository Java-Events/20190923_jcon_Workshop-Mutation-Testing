package junit.org.rapidpm.event.mutationtesting.p002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p002.Service;

/**
 * Create the best test coverage you can for this
 */
class ServiceTest {

  @Test
  void test001() {
    //start here...
    final Service service = new Service();
    int result = service.add(2, 2);
    assertEquals(4, result);

  }

  @Test
  void test002() {
    final Service service = new Service();
    
    int result = service.add(0, 0);
    assertEquals(0, result);
  }
}
