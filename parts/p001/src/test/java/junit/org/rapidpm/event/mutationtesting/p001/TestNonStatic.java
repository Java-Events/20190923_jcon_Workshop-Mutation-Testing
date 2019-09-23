package junit.org.rapidpm.event.mutationtesting.p001;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS )
//@TestInstance(Lifecycle.PER_METHOD) //try it
class TestNonStatic {

	// was static at jUnit4, no choice
	// must be static if @TestInstance(Lifecycle.PER_CLASS ) is not used
	@BeforeAll
	void beforeAll() {
		System.out.println("Before all tests");
	}

	@AfterAll
	void afterAll() {
		System.out.println("After all tests");
	}


	// non static as before (junit4)
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
