package com.example.myphotoapp.Resource;

import com.example.myphotoapp.Service.UserService;
import com.example.myphotoapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserResource {

    @Autowired
    private UserService userService;

    //GET API
    /*@GetMapping("/album")
    public User getUser(){
        return userService.getUser();
    }*/

    //GET API
    @GetMapping("/allalbum")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/album/{slNo}")
    public User getUserById(@PathVariable("slNo") int slNo){
        return userService.getUserById(slNo);
    }


    //POST API
    @PostMapping("/album")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    //PUT API
    @PutMapping("/album/{slNo}")
    public User updateAlbum(@PathVariable("slNo") int slNo,@RequestBody User user){
        return userService.updateAlbum(slNo,user);
    }

    //DELETE API
    @DeleteMapping("/album")
    public User deleteAlbum(@RequestParam(name = "slNo") int slNo){
        return userService.deleteAlbum(slNo);
    }
}
