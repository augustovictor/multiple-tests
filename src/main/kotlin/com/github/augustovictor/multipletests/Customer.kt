package com.github.augustovictor.multipletests

import javax.persistence.*

@Entity
@Table(name = "customers")
class Customer(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(name = "username")
        val username: String? = ""
)
