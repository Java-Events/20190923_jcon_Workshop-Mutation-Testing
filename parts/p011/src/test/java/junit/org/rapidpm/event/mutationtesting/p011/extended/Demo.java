package junit.org.rapidpm.event.mutationtesting.p011.extended;

public class Demo {

	public static int testMe(String a, String b) {
		return a.length() < b.length() ? a.length() : b.length();
	}
}
