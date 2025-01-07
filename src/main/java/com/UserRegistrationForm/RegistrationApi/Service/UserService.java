package com.UserRegistrationForm.RegistrationApi.Service;


import com.UserRegistrationForm.RegistrationApi.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service

public interface UserService {
 public User createAccount(User user);
 public List<User> getAllUsers();

}
