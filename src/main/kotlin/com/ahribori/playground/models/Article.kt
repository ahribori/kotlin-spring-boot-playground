package com.ahribori.playground.models

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