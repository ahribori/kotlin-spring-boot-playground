package com.ahribori.playground.article

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/articles")
class ArticleController {
    @GetMapping("/")
    fun fetchArticle(): String {
        return "Get Article"
    }

    @PostMapping("/")
    fun createArticle(): String {
        return "Post Article"
    }

    @PutMapping("/{articleId}")
    fun modifyArticle(@PathVariable articleId: String): String {
        return "Put Article"
    }

    @DeleteMapping("/{articleId}")
    fun deleteArticle(@PathVariable articleId: String): String {
        return "Delete Article"
    }
}