package net.marcelkoch.contactmailer

data class ContactRequest (
  val message: String,
  var senderAddress: String? = null
)
