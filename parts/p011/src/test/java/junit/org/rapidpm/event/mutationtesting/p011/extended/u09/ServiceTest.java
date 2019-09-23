package junit.org.rapidpm.event.mutationtesting.p011.extended.u09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.rapidpm.event.mutationtesting.p011.extended.u09.Service;
//import org.rapidpm.event.mutationtesting.p011.extended.Service;

public class ServiceTest {

	@Test
	void test01() {
		String[] result = new Service().discardCommonPrefix("ABC", "ABE");
		assertEquals("C", result[0]);
		assertEquals("E", result[1]);
	}
	
	@Test
	void test02() {
		String[] result = Service.discardCommonPrefix("AB", "A");
		assertEquals("B", result[0]);
		assertEquals("", result[1]);
	}
	
	@Test
	void test03() {
		String[] result = Service.discardCommonPrefix("C", "CD");
		assertEquals("", result[0]);
		assertEquals("D", result[1]);
	}
	
	@Test
	void test04() {
		String[] result = Service.discardCommonPrefix("", "");
		assertEquals("", result[0]);
		assertEquals("", result[1]);
	}
	
	@Test
	void test05() {
		String[] result = Service.discardCommonPrefix("AB", "AB");
		assertEquals("", result[0]);
		assertEquals("", result[1]);
	}
}
