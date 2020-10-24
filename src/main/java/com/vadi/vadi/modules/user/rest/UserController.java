package com.vadi.vadi.modules.user.rest;

import com.vadi.vadi.modules.user.domain.User;
import com.vadi.vadi.modules.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/create/{name}/{email}/{telephoneNumber}")
    public User createUser(@PathVariable String name, @PathVariable String email, @PathVariable String telephoneNumber) {
        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setTelephoneNumber(telephoneNumber);

        return userRepository.save(user);
    }

    @GetMapping("/update/{id}/{name}/{email}/{telephoneNumber}")
    public User updateUser(@PathVariable Long id, @PathVariable String name,
                           @PathVariable String email, @PathVariable String telephoneNumber) {
        User user = userRepository.getOne(id);

        user.setName(name);
        user.setTelephoneNumber(telephoneNumber);
        user.setEmail(email);

        return userRepository.save(user);
    }
}
