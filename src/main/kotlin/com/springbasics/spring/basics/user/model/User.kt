package com.springbasics.spring.basics.user.model

import org.hibernate.validator.constraints.NotEmpty
import javax.persistence.*
import javax.validation.constraints.Size

@Entity(name = "User")
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0,
                var name: String,
                var lastName: String)

data class UserDto(@field:NotEmpty val name: String,
                   @field:NotEmpty val lastName: String)