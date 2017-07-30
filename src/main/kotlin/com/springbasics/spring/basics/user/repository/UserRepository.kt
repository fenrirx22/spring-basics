package com.springbasics.spring.basics.user.repository

import com.springbasics.spring.basics.user.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {

    fun findByName(name: String): List<User>

    @Query("select u from User u where u.name = :name")
    fun findAllUsersWithName(@Param("name") name: String): List<User>
}