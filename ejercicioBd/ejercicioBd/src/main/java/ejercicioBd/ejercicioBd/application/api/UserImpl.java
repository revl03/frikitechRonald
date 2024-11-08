package ejercicioBd.ejercicioBd.application.api;

import ejercicioBd.ejercicioBd.entity.User;
import ejercicioBd.ejercicioBd.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService{
    @Autowired
    private final UserRepository userRepository;

    @Override
    public User addUser(String name, String lastname, String email) {
        User user = new User();
        user.setName(name);
        user.setLastname(lastname);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
