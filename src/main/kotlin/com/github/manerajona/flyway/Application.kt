package com.github.manerajona.flyway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class FlywayApplication(private val db: TraineeRepository) {

    @GetMapping("/trainers")
    fun list(): List<Trainee> = db.findAll()

}

fun main(args: Array<String>) {
    runApplication<FlywayApplication>(*args)
}
