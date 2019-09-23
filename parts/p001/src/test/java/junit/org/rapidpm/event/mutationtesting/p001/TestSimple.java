package junit.org.rapidpm.event.mutationtesting.p001;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestSimple {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all tests");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After all tests");
	}



	@BeforeEach
	void beforeEach() {
		System.out.println("Before each test");
	}

	@AfterEach
	void afterEach() {
		System.out.println("After each test");
	}



	@Test
	@DisplayName("The first test")
	void test001() {
		System.out.println("Test 001");
	}

	@Test
	@DisplayName("The second test")
	void test002() {
		System.out.println("Test 002");
	}

}
