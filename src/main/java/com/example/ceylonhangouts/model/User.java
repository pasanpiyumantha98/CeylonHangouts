package com.example.ceylonhangouts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {

    @Id
    int id;

    String fname;
    String lname;
    String Country;
    String email;
    String password;

    String gender;
    String stat;
    int phone;
    String prefgen;

}
