package com.demo.demo.service;

import com.demo.demo.entity.User;
import com.demo.demo.entity.repository.UserRepository;
import com.demo.demo.pojo.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(UserDto userDto){
        User user=User.builder().
                firstName(userDto.getFirstName()).
                lastName(userDto.getLastName()).
                age(userDto.getAge())
        .build();
        return userRepository.save(user);
    }
}
