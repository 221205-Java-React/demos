package com.revature;

import com.revature.daos.EmployeeDAO;
import com.revature.daos.RoleDAO;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Launcher {

    public static void main(String[] args) {

        /*
        This is a try with resources block
        How they work, is a resource is opened within parenthesis
        If successful, the rest of the try block runs
        Another benefit is that the resource will close for us when the block completes
        This is helpful for code cleanup and preventing memory leaks
         */
        try(Connection conn = ConnectionUtil.getConnection()){
            System.out.println("CONNECTION SUCCESSFUL :)");
        }
        catch(SQLException e){
            System.out.println("connection failed :(");
        }


        //TEMPORARY - we'll be accessing the DAO using HTTP Requests later

        //Instantiate a RoleDAO and EmployeeDAO so that we can their methods
        RoleDAO rDAO = new RoleDAO();
        EmployeeDAO eDAO = new EmployeeDAO();

        //getting role by id
        System.out.println(rDAO.getRoleById(3));

        //getting all employees
        System.out.println(eDAO.getEmployees());

    }

}
