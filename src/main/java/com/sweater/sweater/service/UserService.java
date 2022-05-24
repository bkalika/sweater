package com.sweater.sweater.service;

import com.sweater.sweater.domain.Role;
import com.sweater.sweater.domain.User;
import com.sweater.sweater.repos.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.UUID;

/**
 * @author @bkalika
 * Created on 20.05.2022 2:20 PM
 */
@Service
public class UserService implements UserDetailsService {

    private final UserRepo userRepo;

    private final MailSenderService mailSenderService;

    public UserService(UserRepo userRepo, MailSenderService mailSenderService) {
        this.userRepo = userRepo;
        this.mailSenderService = mailSenderService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByName(username);
    }

    public boolean addUser(User user) {
        User userFromDb = userRepo.findByName(user.getName());

        if(userFromDb != null) {
            return false;
        }
        user.setActive(false);
        user.setRoles(Collections.singleton(Role.USER));
        user.setActivationCode(UUID.randomUUID().toString());
        userRepo.save(user);

        if(!StringUtils.isEmpty(user.getEmail())) {
            String message = String.format(
                    "Hello, %s! \n" +
                            "Welcome to Sweater. Please, visit a next link: http://localhost:8080/activate/%s",
                    user.getUsername(),
                    user.getActivationCode()
            );
            mailSenderService.send(user.getEmail(), "Activation code", message);
        }
        return true;
    }

    public boolean activateUser(String code) {
        User user = userRepo.findByActivationCode(code);

        if(user == null) {
            return false;
        }
        user.setActivationCode(null);
        user.setActive(true);
        userRepo.save(user);

        return true;
    }
}
