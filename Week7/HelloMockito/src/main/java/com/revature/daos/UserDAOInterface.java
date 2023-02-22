package com.revature.daos;

import com.revature.models.User;

public interface UserDAOInterface {

    public User findByUsername(String name);
    public User findById(int id);
    public String returnEmployee();
    public String returnManager();

}
