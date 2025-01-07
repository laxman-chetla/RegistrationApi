package com.UserRegistrationForm.RegistrationApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EmailVerification {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false)
    private int VerificationId;
    @Column(nullable = false)
    private String EmailId;
    @Column(nullable = false)
    private int UserId;
}
