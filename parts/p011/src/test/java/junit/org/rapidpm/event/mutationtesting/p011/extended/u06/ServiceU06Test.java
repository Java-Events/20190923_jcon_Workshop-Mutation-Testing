package junit.org.rapidpm.event.mutationtesting.p011.extended.u06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.rapidpm.event.mutationtesting.p011.extended.u06.ServiceU06;

import static org.junit.Assert.assertEquals;

public class ServiceU06Test {
	@ParameterizedTest(name = "Input {0},{1} => Output {2},{3}")
	@CsvSource({
			"'','','',''",
			"ac,abz,c,bz",
			"a,ad,'',d",
			"abc,ab,c,''",
			"ab,ab,'',''",
	})
	void discardCommonPrefix(String a, String b, String expectedA, String expectedB) {
		String[] result = new ServiceU06().discardCommonPrefix(a, b);
		assertEquals(expectedA, result[0]);
		assertEquals(expectedB, result[1]);
	}


}
