package junit.org.rapidpm.event.mutationtesting.p001;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;


@ExtendWith(DemoTest.MySecondExtension.class)
@ExtendWith(DemoTest.MyFirstExtension.class)

public class DemoTest {


  public static class MyFirstExtension
      implements BeforeEachCallback ,
      AfterEachCallback {

    @Override
    public void afterEach(ExtensionContext extensionContext)
        throws Exception {
      System.out.println("after each - 001");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext)
        throws Exception {
      System.out.println("before each - 001");
    }
  }


  public static class MySecondExtension
      implements BeforeEachCallback ,
      AfterEachCallback {

    @Override
    public void afterEach(ExtensionContext extensionContext)
        throws Exception {
      System.out.println("after each - 002");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext)
        throws Exception {
      System.out.println("beafore each - 002");
    }
  }



  @Test
  @DisplayName("my Name")
//  @Order(2)
  void test001() {

  }
  @Test
//  @Order(1)
  void test001_01() {

  }

  @Test
//  @Order(4)
  void test002() {

  }


}
