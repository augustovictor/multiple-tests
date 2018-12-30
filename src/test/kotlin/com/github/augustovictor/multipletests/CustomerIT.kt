package com.github.augustovictor.multipletests

import junit.framework.Assert.assertTrue
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@Category(SlowTests::class)
//@RunWith(SpringRunner::class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
class CustomerIT {
//    @Autowired
//    private lateinit var mockMvc: MockMvc

//    @Test
//    fun `should return 200 on findAll customers`() {
//        mockMvc.perform(MockMvcRequestBuilders.get("/customers"))
//                .andExpect(status().isOk)
//    }

    @Test
    fun longRunningTest() {
        assertTrue(true)
    }
}