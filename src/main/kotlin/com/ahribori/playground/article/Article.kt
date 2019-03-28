package com.ahribori.playground.article

import com.ahribori.playground.user.User
import javax.persistence.*

@Entity
class Article(
        @Id
        @GeneratedValue
        var id: Long? = null,
        var title: String,
        var content: String,
        @ManyToOne
        var author: User
)