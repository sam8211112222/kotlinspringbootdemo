package com.sam.kotlinspringbootdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinspringbootdemoApplication

fun main(args: Array<String>) {
    runApplication<KotlinspringbootdemoApplication>(*args)
}

