package com.goosvandenbekerom.ftpclient.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException(type: String, id: Int) : Exception("$type with id $id not found.")
