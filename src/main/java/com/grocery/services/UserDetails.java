package com.grocery.services;

import com.grocery.dto.User;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface UserDetails {


    public void insertUserDetails(User user);

    public default User getUserDetails(int userId) {
        User user = new User(1,"No Data Found","No Data Found","No Data Found","No Data Found");
        User user1 = new User(1,"Kumar Suraj","CTS","Admin","Y");
        User user2 = new User(1,"Himanshu Singh","PAYTM","Normal","Y");
        if(userId==1){
            return user1;
        }
        if(userId==2){
            return user2;
        }
        final User user3 = user;
        return user3;
    }


}
