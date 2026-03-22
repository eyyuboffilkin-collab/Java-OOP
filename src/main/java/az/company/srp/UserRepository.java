package az.company.srp;

public class UserRepository {
    void save(az.company.srp.User user) {
        System.out.println(user.name + " DB-ya elave olundu");
    }
}
