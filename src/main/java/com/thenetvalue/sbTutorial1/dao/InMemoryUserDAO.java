package com.thenetvalue.sbTutorial1.dao;

import com.thenetvalue.sbTutorial1.model.User;
import com.thenetvalue.sbTutorial1.repository.InMemoryDatabase;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository("firstUserDAO")
public class InMemoryUserDAO implements UserDAO{

    @Override
    public int addUser(User user) {
        return InMemoryDatabase.addUser(user);
    }

    @Override
    public User getUserById(int id) {
        return InMemoryDatabase.getUserById(id);
    }

    @Override
    public Map allUsers() {
        return InMemoryDatabase.allUsers();
    }

    @Override
    public int updateUser(User user) {
        return InMemoryDatabase.updateUser(user);
    }
}
