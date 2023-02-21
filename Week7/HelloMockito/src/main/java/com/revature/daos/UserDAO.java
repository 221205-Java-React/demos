package com.revature.daos;
import com.revature.models.User;
public class UserDAO implements UserDAOInterface{

    public User findByUsername(String name) {
        return new User(1, "coolUsername", "password");
    }

    public User findById(int id) {
        return null;
    }
}