package com.goosvandenbekerom.ftpclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FtpClientApplication

fun main(args: Array<String>) {
    runApplication<FtpClientApplication>(*args)
}