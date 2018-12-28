package com.github.augustovictor.multipletests

import org.springframework.data.repository.Repository

interface CustomerRepository : Repository<Customer, Long> {
    fun findAll(): List<Customer>
}
