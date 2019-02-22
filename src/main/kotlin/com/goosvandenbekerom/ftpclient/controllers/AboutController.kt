package com.goosvandenbekerom.ftpclient.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AboutController {
    @GetMapping("about")
    fun greeting() = "about"
}