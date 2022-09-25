package com.Capstone.Carpooling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value="/")
    public String getPage(){
        return "welcome";
    }

    @GetMapping(value="/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    @GetMapping(value="/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved";
    }
    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id,@RequestBody User user){
        User updatedUser=userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setOccupation(user.getOccupation());
        updatedUser.setAge(user.getAge());
        userRepo.save(updatedUser);
        return "Updated";
    }
    @PutMapping(value = "delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deletedUser=userRepo.findById(id).get();
        userRepo.delete(deletedUser);
        return "Deleted user with id"+ id;
    }


}
