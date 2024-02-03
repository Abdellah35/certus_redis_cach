package com.softedge.solution.certusrediscacheservice.web;

import com.softedge.solution.certusrediscacheservice.redisentity.UserIPVActivation;
import com.softedge.solution.certusrediscacheservice.repository.UserIPVActivationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/redis/user-ipv")
public class UserIPVRedisController {

    @Autowired
    UserIPVActivationRepository userIPVActivationRepository;

    @PostMapping
    public UserIPVActivation add(@RequestBody UserIPVActivation userIPVActivation) {
        return userIPVActivationRepository.save(userIPVActivation);
    }

    @GetMapping
    public UserIPVActivation findById(@RequestParam("email-id") String emailId) {
        Optional<UserIPVActivation> userIPVActivation = userIPVActivationRepository.findById(emailId);
        if (userIPVActivation.isPresent())
            return userIPVActivation.get();
        else
            return null;
    }
}
