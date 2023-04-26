package service;

import java.util.List;
import java.util.Map;
import model.Tag;
import model.User;

public interface UserService {
    Map<User, List<Tag>> findFilteredUsers();
}
