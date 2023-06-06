class EmailService1 {
    fun sendEmail(to: String, subject: String, body: String) {
        // Code to send an email
    }
}

class NotificationService(private val emailService: EmailService1) {
    fun sendNotification(to: String, message: String) {
        val subject = "Notification"
        val body = "Message: $message"
        emailService.sendEmail(to, subject, body)
    }
}
