package com.example.myphotoapp.Repository;
import com.example.myphotoapp.Resource.UserResource;
import com.example.myphotoapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList<>();

    public User getUser(){
        User user = new User("photo1","flower","www.photo1.com");
        return user;
    }

    public User saveUser(User user){
        user.setSlNo(userList.size() + 1);
        userList.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUserById(int slNo) {
        for (User user:userList){
            if (user.getSlNo()== slNo){
                return user;
            }
        }
        return null;
    }

  /*  public User getUserById(int slNo) {
        for (int i=0; i< userList.size(); i++){
            User user = userList.get(i);
            if (user.getSlNo()== slNo){
                return user;
            }
        }
        return null;
    }*/


    //PUT API
    public User updateAlbum(int slNo, User user) {
        for (User u:userList){
            if (u.getSlNo()== slNo){
                u.setName(user.getName());
                u.setDescription(user.getDescription());
                u.setCoverPicUrl(user.getCoverPicUrl());
                return u;
            }
        }
        return null;
    }

    public User deleteAlbum(int slNo) {
        User delatedAlbum = null;

        for (User u:userList){
            if (u.getSlNo() == slNo){
                delatedAlbum = u;
                userList.remove(u);
                return delatedAlbum;
            }
        }
        return delatedAlbum;
    }
}
