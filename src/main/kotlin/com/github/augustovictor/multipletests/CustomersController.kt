package com.github.augustovictor.multipletests

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomersController(
        val customerService: CustomerService
) {
    @GetMapping
    fun findAll(): List<Customer> {
        return customerService.findAll()
    }
}