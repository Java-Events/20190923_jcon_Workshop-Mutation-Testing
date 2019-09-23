package junit.org.rapidpm.event.mutationtesting.p002

/**
 * Create the best test coverage you can.
 * How many tests you will need?
 * What are the "good" tests?
 */
class Service {

    fun add(a: Int, b: Int): Int =
            when {
                a < 2 -> (a + b) * -1
                b > 5 && a < 2 -> b * (a + 1)
                b > 7 && a > 4 -> (b+3) * (-a)
                else -> a + b
            }
}