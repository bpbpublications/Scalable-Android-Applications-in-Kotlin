interface NotificationService1 {
    fun sendNotification(to: String, message: String)
}

class EmailNotificationService(
    private val emailService: EmailService1
) : NotificationService1 {
    override fun sendNotification(to: String, message: String) {
        val subject = "Notification"
        val body = "Message: $message"
        emailService.sendEmail(to, subject, body)
    }
}

class EmailService2 {
    fun sendEmail(to: String, subject: String, body: String) {
        // Code to send an email
    }
}
