package com.springbasics.spring.basics.hello.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.lang.invoke.MethodType
import javax.xml.ws.Response

@RestController
internal class HelloController{

//    @RequestMapping(value = "/hello",
//            method = arrayOf(RequestMethod.GET),
//            produces = arrayOf("application/json"))

    @GetMapping(produces = arrayOf("text/plain"))
    fun hello() : String = "Hello world"

}