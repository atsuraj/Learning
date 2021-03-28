package com.grocery.dto;

import org.springframework.stereotype.Repository;

import java.util.HashMap;


public class User {

    private int userId;
    private String userName;
    private String userDepartment;
    private String userRole;
    private String isAlive;


    public User(int userId, String userName, String userDepartment, String userRole, String isAlive) {
        this.userId = userId;
        this.userName = userName;
        this.userDepartment = userDepartment;
        this.userRole = userRole;
        this.isAlive = isAlive;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(String isAlive) {
        this.isAlive = isAlive;
    }
}
