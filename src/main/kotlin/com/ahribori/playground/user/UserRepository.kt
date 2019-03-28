package com.ahribori.playground.user

import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, String>