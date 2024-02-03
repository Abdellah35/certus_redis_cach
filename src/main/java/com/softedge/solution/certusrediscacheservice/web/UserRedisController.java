package com.softedge.solution.certusrediscacheservice.web;

import com.softedge.solution.certusrediscacheservice.redisentity.User;
import com.softedge.solution.certusrediscacheservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/redis/user")
public class UserRedisController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent())
            return user.get();
        else
            return null;
    }

    @GetMapping("/company-id/{company-id}")
    public List<User> findByCompanyId(@PathVariable("company-id") Long companyId) {
        List<User> users = userRepository.findUserByCompanyId(companyId);
        if (users.size()>0)
            return users;
        else
            return null;
    }

    @GetMapping("/email")
    public User findByCompanyId(@RequestParam("email-id") String emailId) {
        Optional<User> user = userRepository.findUserByemailId(emailId);
        if (user.isPresent())
            return user.get();
        else
            return null;
    }

    /*
    * Temporary Method
    * TODO: remove for production
    *  */
    @GetMapping
    public String hello() {
        return "Hello";
    }
}
