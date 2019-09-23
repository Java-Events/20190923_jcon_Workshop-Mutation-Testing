package junit.org.rapidpm;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldTest {

  @Test
  @DisplayName("Hello World - Vaadin EE Starter Test")
  @Disabled("useless test - always true")
  void test001() {
    assertTrue(true); // switch off for Mutation Testing !!!
  }
}
