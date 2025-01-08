
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

    @PostMapping("/userLogin/{EmailId}/{password}")
    public String userLogin(@PathVariable String EmailId,@PathVariable String password)
    {
        return service.userLogin(EmailId,password);
    }
    @PutMapping("/updateAccount")
    public User updateAccount(User user){
        return service.updateAccount(user);
    }

    @DeleteMapping("/userLogout")
    public String userLogout(){
        return service.userLogout();
    }
    @DeleteMapping("/deleteAccount")
    public String deleteAccount(String EmailId){
        return service.deleteAccount(EmailId);}

}
