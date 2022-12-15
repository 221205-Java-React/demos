package com.revature.models;

public class Employee {

    private int employee_id;
    private String first_name;
    private String last_name;

    /*Employees in Java will contain entire Role objects instead of just an int foreign key
    an int FK is less useful to us than an entire Role object
    useful? If we have the entire Role object, we have access to all of that Role's DATA as well. more data :)
     */
    private Role role;

    //boilerplate code----------------------

    //no-args constructor
    public Employee() {
    }

    //all-args
    public Employee(int employee_id, String first_name, String last_name, Role role) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }

    //all-args minus id
    public Employee(String first_name, String last_name, Role role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", role=" + role +
                '}';
    }
}