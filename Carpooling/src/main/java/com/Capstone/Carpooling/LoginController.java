package com.Capstone.Carpooling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginRepo loginRepo;

    @GetMapping(value="/logindetails")
    public List<Login> getlogin(){
        return loginRepo.findAll();
    }


}
