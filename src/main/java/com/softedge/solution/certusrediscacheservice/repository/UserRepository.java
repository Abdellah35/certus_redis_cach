package com.softedge.solution.certusrediscacheservice.repository;

import com.softedge.solution.certusrediscacheservice.redisentity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findUserByCompanyId(Long companyId);
    Optional<User> findUserByemailId(String emailId);
}
