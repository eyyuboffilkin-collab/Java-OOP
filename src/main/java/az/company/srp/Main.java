package az.company.srp;

public class Main {
    static void main(String[] args) {
        az.company.srp.UserService userService = new UserService(new UserRepository());
        userService.registerUser("Ilkin");
    }
}
