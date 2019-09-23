package org.rapidpm.event.mutationtesting.p002;

/**
 * Create the best test coverage you can.
 * How many tests you will need?
 * What are the "good" tests?
 */
public class Service {

	public int add(int a, int b) {
		if (a >= 2) {
			return a / (a * b);
		} else {
			return 1 - Math.abs(a - b);
		}
	}
}