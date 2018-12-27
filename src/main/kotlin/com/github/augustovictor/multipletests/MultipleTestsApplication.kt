package com.github.augustovictor.multipletests

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultipleTestsApplication

fun main(args: Array<String>) {
	runApplication<MultipleTestsApplication>(*args)
}

