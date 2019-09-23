package junit.org.rapidpm.event.mutationtesting.p003;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(value = ExecutionMode.CONCURRENT)
public class Concurrent001Test {

  @Test
  void test001(TestReporter reporter , TestInfo info) {
    reporter.publishEntry(info.getDisplayName());
  }

  @Test
  void test002(TestReporter reporter , TestInfo info) {
    reporter.publishEntry(info.getDisplayName());
  }

  @Test
  void test003(TestReporter reporter , TestInfo info) {
    reporter.publishEntry(info.getDisplayName());
  }

  @Test
  void test004(TestReporter reporter , TestInfo info) {
    reporter.publishEntry(info.getDisplayName());
  }

  @Test
  void test005(TestReporter reporter , TestInfo info) {
    reporter.publishEntry(info.getDisplayName());
  }

  @Test
  void test006(TestReporter reporter , TestInfo info) {
    reporter.publishEntry(info.getDisplayName());
  }

  @Test
  void test007(TestReporter reporter , TestInfo info) {
    reporter.publishEntry(info.getDisplayName());
  }
}
