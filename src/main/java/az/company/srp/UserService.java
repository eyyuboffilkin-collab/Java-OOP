package az.company.srp;

public class UserService {
    az.company.srp.UserRepository repository;

    UserService(az.company.srp.UserRepository repository) {
        this.repository = repository;
    }

    void registerUser(String name) {
        az.company.srp.User user = new az.company.srp.User(name);
        repository.save(user);
    }
}
