package com.github.augustovictor.multipletests

import org.springframework.stereotype.Service

@Service
class CustomerService(val customerRepository: CustomerRepository) {
    fun findAll(): List<Customer> {
        return customerRepository.findAll()
    }

}
