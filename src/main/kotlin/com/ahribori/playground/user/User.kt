package com.ahribori.playground.user

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(
        @Id
        @GeneratedValue
        var id: Long? = null,
        var userName: String
)