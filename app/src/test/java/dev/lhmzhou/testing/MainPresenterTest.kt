package dev.lhmzhou.testing

import org.junit.Assert.*
import org.junit.Test

class MainPresenterTest {

    @Test
    fun greetFooBar() {
        val result = MainPresenter().greet("FooBar")
        assertEquals(result, "Hello FooBar!")
    }
}
