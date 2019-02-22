package com.goosvandenbekerom.ftpclient.controllers

import com.goosvandenbekerom.ftpclient.services.ConnectionService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController(val connectionService: ConnectionService) {

    @GetMapping("/")
    fun home(model: Model): String {
        model.addAttribute("connections", connectionService.getAll())
        return "index"
    }
}
