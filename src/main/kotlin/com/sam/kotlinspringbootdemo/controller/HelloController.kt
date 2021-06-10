package com.sam.kotlinspringbootdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.util.*

@Controller
class HelloController {
    @GetMapping("/hello")
    fun test(theModel: Model): String {
        theModel.addAttribute("key", Date())
        return "helloworld"
    }
}
