package com.springbasics.spring.basics.user.services

import com.fasterxml.jackson.databind.ObjectMapper
import com.springbasics.spring.basics.user.exceptions.UserNotFoundException
import com.springbasics.spring.basics.user.model.User
import com.springbasics.spring.basics.user.model.UserDto
import com.springbasics.spring.basics.user.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService @Autowired constructor(val userRepository: UserRepository, val objectMapper: ObjectMapper) {


    fun addUser(user: UserDto) {
        val user = User(name = user.name, lastName = user.lastName)
        userRepository.save(user)
    }

    fun getUserByName(name: String): UserDto {
        val user = userRepository.findFirstByName(name) ?: throw UserNotFoundException()
        return objectMapper.convertValue(user, UserDto::class.java)
    }

    fun getAllUsersByName(name: String): List<UserDto> {
        val users = userRepository.findAllUsersWithName(name)
        if (users.isEmpty()) throw UserNotFoundException()
        return users.map { user -> objectMapper.convertValue(user, UserDto::class.java) }
    }
}