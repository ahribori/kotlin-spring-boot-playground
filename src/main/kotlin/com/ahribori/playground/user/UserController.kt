package com.ahribori.playground.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    private lateinit var userRepository: UserRepository

    @GetMapping("")
    fun fetchUser(): MutableIterable<User> {
        return userRepository.findAll()
    }

    @PostMapping("")
    fun createUser(@RequestBody user: User): User {
        return userRepository.save(user)
    }

    @PutMapping("/{userId}")
    fun modifyUser(@PathVariable userId: Long, @RequestBody user: User): User {
        var storedUser: User = userRepository.findById(userId).orElseThrow { UserNotFoundException() }
        storedUser.userName = user.userName;
        return userRepository.save(storedUser);
    }

    @DeleteMapping("/{userId}")
    fun deleteUser(@PathVariable userId: String): String {
        return "Delete User"
    }
}