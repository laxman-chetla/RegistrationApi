
package com.UserRegistrationForm.RegistrationApi.Controller;

import com.UserRegistrationForm.RegistrationApi.Model.User;
import com.UserRegistrationForm.RegistrationApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController{

    @Autowired
    private UserService service;

    @PostMapping("/createAccount")
    @Autowired
    public User createAccount(@RequestBody User user) {
        return service.createAccount(user);
    }
@GetMapping("/getusers")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
    @RequestMapping("/success")
    public String success(){
        return "Laxman succeeded";
    }

}
