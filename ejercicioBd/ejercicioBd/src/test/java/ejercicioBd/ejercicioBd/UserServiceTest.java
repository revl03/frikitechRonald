package ejercicioBd.ejercicioBd;

import ejercicioBd.ejercicioBd.application.api.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserService userService;

    @Test
    void addUserTest(){
        //Mockito.when(userService.addUser(any(String.class),any(String.class),any(String.class))).thenReturn(true);

      //  assertTrue(userService.addUser("Ronald", "Vaca", "ronald@gmail.com"));
    }
}
