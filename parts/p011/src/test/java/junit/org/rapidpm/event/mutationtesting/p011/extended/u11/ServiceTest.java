package junit.org.rapidpm.event.mutationtesting.p011.extended.u11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.Service;

public class ServiceTest {

	@Test
	void test001() {
		String[] result = Service.discardCommonPrefix("ABC", "ABC");

		assertEquals(result[0], "");
		assertEquals(result[1], "");
	}
	
	@Test
	void test002() {
		String[] result = Service.discardCommonPrefix("ABCD", "ABC");

		assertEquals(result[0], "D");
		assertEquals(result[1], "");
	}
	
	@Test
	void test003() {
		String[] result = Service.discardCommonPrefix("ABC", "ABCD");

		assertEquals(result[0], "");
		assertEquals(result[1], "D");
	}

}
