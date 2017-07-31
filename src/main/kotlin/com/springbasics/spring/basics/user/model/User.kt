package com.springbasics.spring.basics.user.model

import org.hibernate.validator.constraints.NotEmpty
import java.util.*
import javax.persistence.*

@Entity(name = "User")
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0,
                var name: String = "",
                var lastName: String = "")

data class UserDto(@NotEmpty val name: String,
                   @NotEmpty val lastName: String)