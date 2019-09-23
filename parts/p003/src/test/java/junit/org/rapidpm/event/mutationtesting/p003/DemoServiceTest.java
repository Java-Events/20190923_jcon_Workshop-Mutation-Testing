package junit.org.rapidpm.event.mutationtesting.p003;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p003.DemoService;

public class DemoServiceTest {

  @Test
  void test001() throws Exception {
    final Date convert = new DemoService().convert("2019-03-12");
    Assertions.assertEquals("Tue Mar 12 00:00:00 EET 2019" , convert.toString());
  }


  @Test
  void test002() throws Exception {
    final Date convert = new DemoService().convert("2019-03-13");
    Assertions.assertEquals("Wed Mar 13 00:00:00 EET 2019" , convert.toString());
  }

  @Test
  void test003() throws Exception {
    final Date convert = new DemoService().convert("2019-03-14");
    Assertions.assertEquals("Thu Mar 14 00:00:00 EET 2019" , convert.toString());
  }

  @Test
  void test004() throws Exception {
    final Date convert = new DemoService().convert("2019-03-15");
    Assertions.assertEquals("Fri Mar 15 00:00:00 EET 2019" , convert.toString());
  }
}
