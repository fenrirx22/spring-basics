package com.springbasics.spring.basics.user.controller

import com.springbasics.spring.basics.user.model.UserDto
import com.springbasics.spring.basics.user.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
import javax.websocket.server.PathParam

@RestController
@RequestMapping("user")
internal class UserController @Autowired constructor(val userService: UserService) {

    @GetMapping(produces = arrayOf("application/json"))
    fun getUser(@PathParam("name") name: String): ResponseEntity<UserDto> {
        return ResponseEntity(userService.getUserByName(name), HttpStatus.OK)
    }

    @PostMapping(value = "add", consumes = arrayOf("application/json"))
    fun addUser(@RequestBody @Valid userDto: UserDto): HttpStatus {
        userService.addUser(userDto)
        return HttpStatus.OK
    }
}