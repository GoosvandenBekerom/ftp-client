package com.goosvandenbekerom.ftpclient.controllers

import com.goosvandenbekerom.ftpclient.exceptions.NotFoundException
import com.goosvandenbekerom.ftpclient.services.ConnectionService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class ConnectController(val connectionService: ConnectionService) {
    @RequestMapping("/connect")
    fun connectionPage(@RequestParam(value = "connection") connectionId: Int, model: Model): String {
        val connection = connectionService.get(connectionId)
                .orElseThrow { NotFoundException("Connection", connectionId) }

        model.addAttribute("connection", connection)
        return "connect"
    }
}