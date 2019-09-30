package net.marcelkoch.contactmailer

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {

  @PostMapping("/contact-request", consumes = ["application/json"])
  @ResponseStatus(HttpStatus.CREATED)
  fun sendMessage(@RequestBody contactRequest: ContactRequest) {
    println(contactRequest.message)
  }

}
