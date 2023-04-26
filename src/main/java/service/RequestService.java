package service;

import model.StackoverflowResponse;
import model.Tag;
import model.User;

public interface RequestService {
    StackoverflowResponse<User> getUsers(int page);

    StackoverflowResponse<Tag> getTagsByUser(long id, int page);
}
