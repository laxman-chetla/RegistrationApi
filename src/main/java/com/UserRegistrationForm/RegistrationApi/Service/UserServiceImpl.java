package com.UserRegistrationForm.RegistrationApi.Service;

import com.UserRegistrationForm.RegistrationApi.Model.Gender;
import com.UserRegistrationForm.RegistrationApi.Model.User;
import com.UserRegistrationForm.RegistrationApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepo;
 
    @Override
    public User createAccount(User user){

        return userRepo.save(user);
    }
   
    @Override
    public User updateAccount(User user){
      return userRepo.save(user);
    };
    @Override
    public String userLogin(String EmailId,String password){
        return "Login Success";
    };
    @Override
    public String userLogout(){
        return "Logged out";
    };
    @Override
    public String deleteAccount(String EmailId){
        return "Account deleted successfully";
    };


}



