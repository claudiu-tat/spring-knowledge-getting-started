package ro.sda.dependency_injection;

public class EmailService {

    public void sendEmail(String message, String  reciver) {
        //logic to send email
        System.out.println("Email send to " + reciver + " with message " + message);
    }
}
