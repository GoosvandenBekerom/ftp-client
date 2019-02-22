package com.goosvandenbekerom.ftpclient.services

import com.goosvandenbekerom.ftpclient.models.Connection
import org.springframework.stereotype.Service
import java.util.*

@Service
class ConnectionService {

    private val connections = mutableSetOf(
            Connection(1, "Printer", "192.168.1.134", "ollie", "ollie", "files"),
            Connection(2, "Work", "ftp.company.domain", "goos", "password", "shared")
    )

    fun getAll(): Set<Connection> {
        return connections.toSet()
    }

    fun get(connectionId: Int): Optional<Connection> {
        return Optional.ofNullable(connections.firstOrNull{ c -> c.id == connectionId })
    }
}
