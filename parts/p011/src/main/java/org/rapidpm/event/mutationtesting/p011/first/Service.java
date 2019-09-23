package org.rapidpm.event.mutationtesting.p011.first;

/**
 * Create the best test coverage you can.
 *
 * How many tests you will need?
 * What are the "good" tests?
 */
public class Service {
	/**
	 * A non-sense add method
	 * @param a
	 * @param b
	 * @return a usefull result
	 */
	public int add(int a, int b) {
		if (a < 2) {
			return (a + b) * -1;
		} else {
			return a + b;
		}
	}
}
