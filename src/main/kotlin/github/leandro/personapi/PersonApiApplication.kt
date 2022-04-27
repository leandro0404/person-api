package github.leandro.personapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PersonApiApplication

fun main(args: Array<String>) {
	runApplication<PersonApiApplication>(*args)
}
