package com.springbasics.spring.basics

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBasicsApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBasicsApplication::class.java, *args)
}
