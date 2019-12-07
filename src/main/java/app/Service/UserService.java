package app.Service;

import app.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getAll() {
        return Arrays.asList(
                new User("Jim"),
                new User("John"));
    }
}
