package junit.org.rapidpm.event.mutationtesting.p002;

import static org.junit.Assert.assertEquals;

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

    final int result = service.add(2, 0);
    assertEquals(2, result);
  }

//  @Test
//  void test002() {
//    final Service service = new Service();
//    
//    final int result = service.add(1, 0);
//    assertEquals(-1, result);
//  }
//
  @Test
  void test003() {
    final Service service = new Service();
    
    final int result = service.add(6, 6);
    assertEquals(12, result);
  }

  @Test
  void test004() {
    //start here...
    final Service service = new Service();

    final int result = service.add(1, 1);
    assertEquals(-2, result);
  }

  @Test
  void test005() {
    //start here...
    final Service service = new Service();

    final int result = service.add(5, 5);
    assertEquals(5, result);
  }

}
