package junit.org.rapidpm.event.mutationtesting.p011.extended;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.Service;

class TestService {

	@Test
	void test001() {
		String[] result = Service.discardCommonPrefix("ABC", "ABD");

		assertEquals(result[0], "C");
		assertEquals(result[1], "D");
	}

	@Test
	void test002() {
		String[] result = Service.discardCommonPrefix("ABC", "DEF");

		assertEquals(result[0], "ABC");
		assertEquals(result[1], "DEF");
	}

	@Test
	void test003() {
		String[] result = Service.discardCommonPrefix("DEF", "ABC");

		assertEquals(result[0], "DEF");
		assertEquals(result[1], "ABC");
	}
	
	@Test
	void test004() {
		String[] result = Service.discardCommonPrefix("ABD", "ABC");

		assertEquals(result[0], "D");
		assertEquals(result[1], "C");
	}
	
	@Test
	void test005() {
		String[] result = Service.discardCommonPrefix("", "ABC");

		assertEquals(result[0], "");
		assertEquals(result[1], "ABC");
	}
	
	@Test
	void test006() {
		String[] result = Service.discardCommonPrefix("", "");

		assertEquals(result[0], "");
		assertEquals(result[1], "");
	}
	
	@Test
	void test007() {
		String[] result = Service.discardCommonPrefix("ABC", "ABC");

		assertEquals(result[0], "");
		assertEquals(result[1], "");
	}
}
