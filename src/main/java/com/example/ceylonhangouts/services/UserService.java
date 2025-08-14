package com.example.ceylonhangouts.services;

import com.example.ceylonhangouts.dto.UserDto;
import com.example.ceylonhangouts.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    public String RegUser(UserDto userDto){



        return "Success";
    }


}
