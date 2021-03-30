package com.grocery.services;

import com.grocery.dto.User;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface UserDetails {


    public void insertUserDetails(User user);

    public default User getUserDetails(int userId) {
        User user = new User(0,"No Data Found","No Data Found","No Data Found","No Data Found");
        User user1 = new User(1,"Kumar Suraj","CTS","Admin","Y");
        User user2 = new User(2,"Himanshu Singh","PAYTM","Normal","Y");
        User user3 = new User(3,"Ng Suraj CIG","DXC","ibps Master","Y");
        User user5 = new User(3,"Gagan Kinger","Sarthi Digital","ibps Master","Y");
        if(userId==1){
            return user1;
        }
        if(userId==2){
            return user2;
        } if(userId==3){
            return user3;
        } if(userId==4){
            return user5;
        }
        final User user4 = user;
        return user4;
    }


}
