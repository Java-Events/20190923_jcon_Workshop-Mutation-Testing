package junit.org.rapidpm.event.mutationtesting.p001;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyArroundClassExtension.class)
@ExtendWith(MyArroundMethodExtension.class)
public class TestLifecycleExtension {
	
	@Test
	public void test001() {
		System.out.println("The test");
	}
}
