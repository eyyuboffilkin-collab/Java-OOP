package az.company.ocp;

public class EmailNotification extends az.company.ocp.Notification {
    void send(String message) {
        System.out.println("Email: " + message);
    }
}
