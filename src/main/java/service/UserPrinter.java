package service;

import java.util.List;
import java.util.Map;
import model.Tag;
import model.User;

public interface UserPrinter {
    void print(Map<User, List<Tag>> usersWithTags);
}
