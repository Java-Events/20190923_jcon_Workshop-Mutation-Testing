package junit.org.rapidpm.event.mutationtesting.p011.extended.u11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.org.rapidpm.event.mutationtesting.p011.extended.Demo;

public class DemoTest {

	@Test
	void test001() {
		int result = Demo.testMe("ABC", "ABCD");

		assertEquals(3, result);
	}

	@Test
	void test002() {
		int result = Demo.testMe("ABC", "ABC");

		assertEquals(3, result);
	}
	
	@Test
	void test003() {
		int result = Demo.testMe("ABCD", "ABC");

		assertEquals(3, result);
	}
}
