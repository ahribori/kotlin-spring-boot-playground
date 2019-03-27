package com.ahribori.playground.controllers

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {
    @GetMapping("/")
    fun fetchUser(): String {
        return "Get User"
    }

    @PostMapping("/")
    fun createUser(): String {
        return "Post User"
    }

    @PutMapping("/{userId}")
    fun modifyUser(@PathVariable userId: String): String {
        return "Put User"
    }

    @DeleteMapping("/{userId}")
    fun deleteUser(@PathVariable userId: String): String {
        return "Delete User"
    }
}