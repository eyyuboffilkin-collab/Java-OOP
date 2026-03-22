package az.company.dip;

class UserController {
    Database db;

    UserController(Database db) {
        this.db = db;
    }

    void saveUser(String name) {
        db.connect();
        System.out.println(name + " user əlavə olundu");
    }
}