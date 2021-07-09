package com.grocery.dto;

import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {

    private  int userId;
    private String userName;
    private String userDepartment;
    private String userRole;
    private String isAlive;



}
