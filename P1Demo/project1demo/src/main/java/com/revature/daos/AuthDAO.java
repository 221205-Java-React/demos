package com.revature.daos;

import com.revature.models.Employee;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;

public class AuthDAO {

    //for THIS method in particular, since we don't have username/password, we'll use first_name/last_name
    //change it accordingly for your own application.

    public Employee login(String username, String password){

        try(Connection conn = ConnectionUtil.getConnection()){

        

        }

    }



    //presumably you'd put your register method here as well, unless you just use the insert method for that
    //for P1 you can probably just stick with the insert employee method for register user

}
