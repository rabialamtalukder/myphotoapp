package com.example.myphotoapp.Service;
import com.example.myphotoapp.Repository.UserRepository;
import com.example.myphotoapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
    }

    public User saveUser(User user){
        return userRepository.saveUser(user);
    }


    //GET API
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    //GET API
    public User getUserById(int slNo) {
        return userRepository.getUserById(slNo);
    }

    //PUT API
    public User updateAlbum(int slNo, User user) {
        return userRepository.updateAlbum(slNo, user);
    }

    //DELETE
    public User deleteAlbum(int slNo) {
        return userRepository.deleteAlbum(slNo);
    }
}
