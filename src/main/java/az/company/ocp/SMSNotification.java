package az.company.ocp;

public class SMSNotification extends az.company.ocp.Notification {
    void send(String message) {
        System.out.println("SMS: " + message);
    }
}
