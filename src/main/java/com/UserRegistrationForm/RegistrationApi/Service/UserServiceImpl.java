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
 /*List<User> users= new Arrays.asList(new User(1,"laxman","lax4@gmail.com","lax123", Gender.Male,Boolean.TRUE,"hyderabad"));*/
    @Override
    public User createAccount(User user){

        return userRepo.save(user);
    }
   public List<User> getAllUsers(){
        return userRepo.findAll();}


}



