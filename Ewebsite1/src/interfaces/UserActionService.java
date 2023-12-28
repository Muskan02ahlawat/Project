package interfaces;

import beans.User;

public interface UserActionService {
    User createUser(User user);
    void deleteUser(String userId);
}
