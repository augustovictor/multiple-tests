package com.github.augustovictor.multipletests

import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.experimental.categories.Category


@Category(IntegrationTest::class)
class CustomerIT {
    @Test
    fun `test should fail`() {
        assertTrue(false)
    }

    @Test
    fun `should take 8sec to complete and pass`() {
        Thread.sleep(8_000)
        assertTrue(true)
    }

    @Test
    fun `should take 3sec to complete and pass`() {
        Thread.sleep(3_000)
        assertTrue(true)
    }

    @Test
    fun `should take 5sec to complete and fail`() {
        Thread.sleep(3_000)
        assertTrue(false)
    }

    @Test
    fun `should take 2sec to complete and pass`() {
        Thread.sleep(2_000)
        assertTrue(true)
    }

    @Test
    fun `should take 7sec to complete and fail`() {
        Thread.sleep(2_000)
        assertTrue(false)
    }

}