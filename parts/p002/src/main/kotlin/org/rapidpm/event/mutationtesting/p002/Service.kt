package org.rapidpm.event.mutationtesting.p002

/**
 * Create the best test coverage you can.
 * How many tests you will need?
 * What are the "good" tests?
 */
class Service {

    fun add(a: Int, b: Int): Int {
        return when {
            a < 2 -> (a - b) * -1
            b > 0 -> b - a
            else -> a + b
        }
    }
}
