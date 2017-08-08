package com.springbasics.spring.basics.unit

import com.fasterxml.jackson.databind.ObjectMapper
import com.springbasics.spring.basics.user.exceptions.UserNotFoundException
import com.springbasics.spring.basics.user.repository.UserRepository
import com.springbasics.spring.basics.user.services.UserService
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.internal.runners.statements.ExpectException
import org.junit.rules.ExpectedException
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.ArgumentMatchers
import org.mockito.ArgumentMatchers.*
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

class UserServiceTest{

    @Rule
    @JvmField
    val expectedException: ExpectedException = ExpectedException.none()

    lateinit var userService: UserService

    @Mock
    lateinit var fakeUserRepo: UserRepository

    @Before
    fun setup(){
        MockitoAnnotations.initMocks(this)
        userService = UserService(fakeUserRepo, ObjectMapper())
    }

    @Test
    fun getUserShouldThrowUserNotFoundExceptionWhenNoUserIsFound(){
        `when`((fakeUserRepo.findFirstByName(anyString()))).thenReturn(null)

        expectedException.expect(UserNotFoundException::class.java)

        userService.getUserByName("Jan")

    }

    @Test(expected = UserNotFoundException::class)
    fun getUserShouldThrowUserNotFoundExceptionWhenNoUserIsFound_Alternative(){
        `when`((fakeUserRepo.findFirstByName(anyString()))).thenReturn(null)

        userService.getUserByName("Jan")
    }

}