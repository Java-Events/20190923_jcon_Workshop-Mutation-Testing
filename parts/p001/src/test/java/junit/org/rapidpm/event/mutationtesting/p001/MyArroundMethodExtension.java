package junit.org.rapidpm.event.mutationtesting.p001;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;

public class MyArroundMethodExtension implements AfterEachCallback, BeforeEachCallback {

	private Namespace namespace = Namespace.create("AroundMethodNamespace");

	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		System.out.println("beforeEach");
		context.getStore(namespace).put("KEY", "beforeEach - context");
	}

	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		System.out.println("afterEach");
		System.out.println(context.getStore(namespace).get("KEY"));
	}

}