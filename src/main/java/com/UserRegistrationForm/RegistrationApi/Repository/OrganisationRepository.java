package com.UserRegistrationForm.RegistrationApi.Repository;

import com.UserRegistrationForm.RegistrationApi.Model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface OrganisationRepository extends JpaRepository<Organisation,Integer> {
}
