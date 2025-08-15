package com.example.ceylonhangouts.controller;

import com.example.ceylonhangouts.dto.UserDto;
import com.example.ceylonhangouts.model.User;
import com.example.ceylonhangouts.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @PostMapping("/register")
    public String register(@RequestBody UserDto userDto) {

        return userService.RegUser(userDto);

    }

    @PostMapping("/login")
    public String login(@RequestBody UserDto userDto) {
        return userService.loguser(userDto);
    }

    @PostMapping("/change/pass")
    public String changePass(@RequestBody UserDto userDto) {

        return userService.changepass(userDto);

    }

}
