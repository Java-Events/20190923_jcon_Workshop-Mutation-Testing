package junit.org.rapidpm.event.mutationtesting.p001;

import static java.lang.String.valueOf;
import static java.lang.System.nanoTime;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.rapidpm.frp.model.Pair;

public class TestTestReporter {


  @Test
  void test001(TestReporter reporter) {
    reporter.publishEntry("Hello Reporter..");
  }

  @Test
  void test002(TestReporter reporter) {
    reporter.publishEntry("Key", "Value");
  }


  @Test
  void test003(TestReporter reporter) {

    final Map<String, String> map = IntStream
        .rangeClosed(0 , 3)
        .mapToObj(i -> Pair.next(valueOf(i) ,
                                 valueOf(nanoTime())))
        .collect(Collectors.toMap(Pair::getT1 , Pair::getT2));

    reporter.publishEntry(map);
  }
}
