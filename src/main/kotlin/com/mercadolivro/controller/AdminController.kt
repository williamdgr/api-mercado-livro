package com.mercadolivro.controller

import com.mercadolivro.service.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("admin")
class AdminController(
    private val customerService: CustomerService
) {

    @GetMapping("/reports")
    fun report(): String {
        return "This is a report. Only admin can see it!"
    }

}