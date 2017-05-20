package net.pdutta.sandbox

import org.junit.Assert.*
import org.junit.Test

class TextOperationsKtTest {

    // Piglatin rules and translations taken from
    // http://www.snowcrest.net/donnelly/piglatin.html

    @Test
    fun testPiglatin() {
        assertEquals("easeplay ingbray ymay aardvarkway omesay almondway ilkmay", piglatin("please bring my aardvark some almond milk"))
        assertEquals("ietquay aardvarkway", piglatin("quiet aardvark"))
        assertEquals("ethay ellowyay ylestay algalway owthgray", piglatin("the yellow style algal growth"))
    }
}
