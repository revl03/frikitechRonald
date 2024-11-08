package ejercicioBd.ejercicioBd;

import ejercicioBd.ejercicioBd.application.api.UserService;
import ejercicioBd.ejercicioBd.entity.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;


    @GetMapping("/addUser")
    public ResponseEntity<User>addUser(@RequestParam String name, @RequestParam String lastname,
                                           @RequestParam String email){
        return ResponseEntity.ok(userService.addUser(name,lastname,email));
    }
    @GetMapping("/listAll")
    public ResponseEntity<List<User>>getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
