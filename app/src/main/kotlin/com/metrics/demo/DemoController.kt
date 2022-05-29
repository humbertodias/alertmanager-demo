package com.metrics.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class DemoController {
    @GetMapping("/status/{code}")
    fun status(@PathVariable code: Int = 200): ResponseEntity<String> {
        return ResponseEntity.status(code).build()
    }

}