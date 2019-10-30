package com.dmagdaleno.migrationtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MigrationTestApplication

fun main(args: Array<String>) {
	runApplication<MigrationTestApplication>(*args)
}
