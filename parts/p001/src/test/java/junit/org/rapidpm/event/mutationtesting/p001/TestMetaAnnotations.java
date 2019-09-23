package junit.org.rapidpm.event.mutationtesting.p001;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class TestMetaAnnotations {

	@DisplayName("With meta annotation - mac")
	@TestOnMac
	void test001() {
		System.out.println("Only on mac by meta annotation");
	}

	@DisplayName("With meta annotation - linux")
	@TestOnLinux
	void test002() {
		System.out.println("Only on linux by meta annotation");
	}

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Test
	@EnabledOnOs(OS.MAC)
	@interface TestOnMac {
	}

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Test
	@EnabledOnOs(OS.LINUX)
	@interface TestOnLinux {
	}
}
