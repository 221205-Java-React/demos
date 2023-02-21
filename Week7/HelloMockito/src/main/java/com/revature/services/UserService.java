package com.revature.services;
import com.revature.daos.UserDAOInterface;
import com.revature.models.User;

/*we haven't really talked much about service classes
but they sit between the controllers and DAOs, and contain extra business logic
anything talking directly to the DB is in the DAO Layer
anything taking in and processing HTTP requests is in the controller layer
EVERYTHING ELSE should probably go in the service layer */

public class UserService {
    private UserDAOInterface dao;

    public UserService(UserDAOInterface dao) {
        super();
        this.dao = dao;
    }
    public User loginWithId(int id, String password) {
        User u = dao.findById(id);
        try {
            System.out.println(u);
            if (u.getPassword().equals(password)) {
                return u;
            }} catch (Exception e) {
            System.out.println("oops...");
        }
        return null;
    }
    public User loginWithName(String name, String password) {
        User u = dao.findByUsername(name);

        try {
            System.out.println(u);
            if (u.getPassword().equals(password)) {
                return u;
            }
        } catch (Exception e) {
            System.out.println("oops...");
        }
        return null;
    }
}