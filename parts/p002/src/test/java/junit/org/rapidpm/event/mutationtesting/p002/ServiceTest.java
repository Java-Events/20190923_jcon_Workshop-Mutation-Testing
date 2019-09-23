package junit.org.rapidpm.event.mutationtesting.p002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p002.Service;

/**
 * Create the best test coverage you can for this
 */
class ServiceTest {


    @Test
    void test000() {
        final Service service = new Service();
        Assertions.assertEquals( 0, service.add(0,0));
    }

  @Test
  void test001a() {
        final Service service = new Service();
        Assertions.assertEquals( -1, service.add(1,0));
  }

    @Test
    void test001b() {
        final Service service = new Service();
        Assertions.assertEquals( -5, service.add(1,4));
    }

  @Test
  void test002() {
      final Service service = new Service();
      Assertions.assertEquals(6, service.add(2, 4));
  }

    @Test
    void test003() {
        final Service service = new Service();
        Assertions.assertEquals(7, service.add(3, 4), "3+4");
    }

    @Test
    void testMinus1() {
        final Service service = new Service();
        Assertions.assertEquals(1, service.add(-1, 0), "3+4");
    }
}
