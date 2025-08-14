package com.example.ceylonhangouts.services;

import com.example.ceylonhangouts.dto.UserDto;
import com.example.ceylonhangouts.model.User;
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

        Integer id = userRepo.getMaxId();

        if(id == null) {
            userDto.setId(1);
        } else {

            id = id +1 ;
            userDto.setId(id);
        }


        User user = userRepo.getUserByEmail(userDto.getEmail());

        if(user==null) {
            userRepo.save(modelMapper.map(userDto, User.class));
            return "Success";
        }
        else {
            return "Error";
        }
        }
    }



