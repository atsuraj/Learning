package com.grocery.controller;

import com.grocery.dto.User;
import com.grocery.serviceImpl.UserServiceImpl;
import com.grocery.services.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/rest")
public class UserController {


    @RequestMapping(value="/getUserDetails/{userIndex}",method= RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable("userIndex") int userIndex){
        UserDetails userDetails = new UserServiceImpl();
                return new ResponseEntity<User>(userDetails.getUserDetails(userIndex), HttpStatus.OK);
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world";
    }
    //
}
