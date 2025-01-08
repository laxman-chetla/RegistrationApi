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
 public User updateAccount(User user);
 public String userLogin(String EmailId,String password);
 public String userLogout();
 public String deleteAccount(String EmailId);

}
