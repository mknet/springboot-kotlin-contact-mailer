package net.marcelkoch.contactmailer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContactMailerApplication

fun main(args: Array<String>) {
	runApplication<ContactMailerApplication>(*args)
}
