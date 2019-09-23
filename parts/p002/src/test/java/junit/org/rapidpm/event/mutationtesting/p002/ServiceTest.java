package junit.org.rapidpm.event.mutationtesting.p002;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

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
    
    //when
    int add = service.add(1, 1);

    //then
    assertThat(add, is(-2));
  }

  @Test
  void test002() {
    final Service service = new Service();
    
    //when
    int add = service.add(2, 2);

    //then
    assertThat(add, is(4));

  }
}
