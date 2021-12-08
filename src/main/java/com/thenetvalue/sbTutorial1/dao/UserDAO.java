package com.thenetvalue.sbTutorial1.dao;

import com.thenetvalue.sbTutorial1.model.User;

import java.util.Map;

public interface UserDAO {

    public int addUser(User user);
    public User getUserById(int id);
    public Map allUsers();
    public int updateUser(User user);
}
