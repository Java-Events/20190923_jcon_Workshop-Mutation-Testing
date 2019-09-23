package junit.org.rapidpm.event.mutationtesting.p002

import org.junit.jupiter.api.Test
import org.rapidpm.event.mutationtesting.p002.Service

import org.junit.Assert.assertEquals

/**
 * Create the best test coverage you can for this
 */
internal class ServiceTest {

    @Test
    fun test001() {
        //start here...
        val service = Service()

        val result = service.add(1, 1)

        assertEquals(-2, result.toLong())
    }

    @Test
    fun test002() {
        val service = Service()

        val result = service.add(2, 0)

        assertEquals(2, result.toLong())
    }
}
