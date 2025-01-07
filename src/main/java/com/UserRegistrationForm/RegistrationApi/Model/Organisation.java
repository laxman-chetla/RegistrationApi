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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Organisation extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true,nullable = false)
    private int UserId;
    @Column(unique = true,nullable = false)
    private String organisationName;
    @Column(unique = true)
    private String missionStatement;
    @Column(nullable = false)
    private String contactNo;
    @Column(nullable = false)
    private String websiteUrl;
    @Column(nullable = false)
    private String ownerName;
    @Column()
    private List<String> availableTasks= new ArrayList<>();



}
