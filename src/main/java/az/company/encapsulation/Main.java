package az.company.encapsulation;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();

        login.setUsername("Ilkin");
        login.setPassword("123456");

        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());

    }
}
