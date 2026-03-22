package az.company.ocp;

public class Main {
    static void main(String[] args) {
        az.company.ocp.Notification email = new az.company.ocp.EmailNotification();
        az.company.ocp.Notification sms = new az.company.ocp.SMSNotification();

        email.send("Salam!");
        sms.send("Salam!");
    }
}
