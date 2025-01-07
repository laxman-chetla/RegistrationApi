package com.UserRegistrationForm.RegistrationApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int UserId;
    @Column(nullable = false)
    private String UserName;
    @Column(nullable = false,unique = true)
    private String EmailId;
    @Column(nullable = false,unique = true)
    private String password;
    @Column(nullable = false)
    private Enum Gender;
    @Column(nullable = false)
    private Boolean IsVerified;
    @Column(nullable = false)
    private String Address;

}
