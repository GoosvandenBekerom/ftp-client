package com.goosvandenbekerom.ftpclient.models

data class Connection(
        val id: Int,
        val name: String,
        val host: String,
        val username: String,
        val password: String,
        val folder: String
)
