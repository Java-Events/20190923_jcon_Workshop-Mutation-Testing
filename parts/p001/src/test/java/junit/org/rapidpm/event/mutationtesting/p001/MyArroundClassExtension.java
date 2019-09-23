package junit.org.rapidpm.event.mutationtesting.p001;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;

public class MyArroundClassExtension
		implements BeforeAllCallback,
		AfterAllCallback {


	private Namespace namespace
			= Namespace.create("AroundClassNamespace");

	@Override
	public void beforeAll(ExtensionContext context) throws Exception {
		System.out.println("beforeAll");
		context.getStore(namespace).put("KEY", "beforeAll - context");
	}

	@Override
	public void afterAll(ExtensionContext context) throws Exception {
		System.out.println("afterAll");
		System.out.println(context.getStore(namespace).get("KEY"));
	}

}