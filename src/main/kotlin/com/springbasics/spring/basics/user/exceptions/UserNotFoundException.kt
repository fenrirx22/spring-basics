package com.springbasics.spring.basics.user.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "user not found")
class UserNotFoundException: RuntimeException()