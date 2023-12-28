package services;

import beans.User;
import interfaces.UserActionService;

import java.util.ArrayList;
import java.util.List;

public class UserActionServiceImpl implements UserActionService {
    List<User> users = new ArrayList<>();
    @Override
    public User createUser(User user) {
        User user1 = new User();
        user1.setUserId(user.getUserId());
        user1.setPassword(user.getPassword());
        user1.setName(user.getName());
        users.add(user1);
        return user1;
    }

    @Override
    public void deleteUser(String userId) {
        for(int i = 0;i < users.size();i++){
            if(users.get(i).getUserId() == userId){
                users.get(i).setPassword(null);
                users.get(i).setName(null);
                users.get(i).setUserId(null);
        }
    }

    }
}
