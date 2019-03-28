package com.ahribori.playground.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

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
    fun modifyUser(@PathVariable userId: String, @RequestBody user: User): String {
        return "Modify User"
    }

    @DeleteMapping("/{userId}")
    fun deleteUser(@PathVariable userId: String): String {
        return "Delete User"
    }
}