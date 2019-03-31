package com.ahribori.playground.user

import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository: CrudRepository<User, String> {
    fun findById(userId: Long): Optional<User>
}