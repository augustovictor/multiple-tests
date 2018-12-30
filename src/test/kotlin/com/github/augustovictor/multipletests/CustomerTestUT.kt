package com.github.augustovictor.multipletests

import org.junit.Assert.*
import org.junit.Test
import org.junit.experimental.categories.Category

@Category(FastTests::class)
class CustomerTestUT {
    @Test
    fun `should return 5 for username abcde`() {
        assertEquals(5, Customer(username = "abcde").usernameCharCount())
    }

    @Test
    fun `should return 0 for no username`() {
        assertEquals(0, Customer().usernameCharCount())
    }
}