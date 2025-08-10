package com.example.ceylonhangouts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    int id;

    String fname;
    String lname;
    String Country;
    String email;
    String password;
}
