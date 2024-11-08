package ejercicioBd.ejercicioBd.application.api;

import ejercicioBd.ejercicioBd.entity.User;

import java.util.List;

public interface UserService {
    User addUser(String name, String lastname, String email);
    List<User> getAllUsers();
}
