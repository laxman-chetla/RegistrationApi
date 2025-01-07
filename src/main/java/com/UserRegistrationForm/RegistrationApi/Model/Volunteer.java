package com.UserRegistrationForm.RegistrationApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Component
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Volunteer extends User{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private int UserId;
    @Column(nullable = false)
    private String mobileNo;
    @Column()
    private List<String> skills= new ArrayList<>();
    @Column()
    private String availability;
    @Column()
    private Experience experience;


}