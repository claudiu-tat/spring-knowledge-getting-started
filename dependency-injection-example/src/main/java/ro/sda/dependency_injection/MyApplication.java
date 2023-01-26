package ro.sda.dependency_injection;

public class MyApplication {
    private EmailService emailService = new EmailService();

    public void processMessage(String msg, String rcv) {
        this.emailService.sendEmail(msg,rcv);
    }
}
