package az.company.dip;

public class Main {
    static void main(String[] args) {
        UserController userController = new UserController(new MySQLDatabase());
        userController.saveUser("Ilkin");
    }
}
