package com.sweater.sweater.service;

import com.sweater.sweater.domain.Role;
import com.sweater.sweater.domain.User;
import com.sweater.sweater.repos.UserRepo;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.MailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

/**
 * @author @bkalika
 * Created on 06.08.2022 7:25 AM
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepo userRepo;

    @MockBean
    private MailSender mailSender;

    @MockBean
    private PasswordEncoder passwordEncoder;

//    @Test
//    public void addUser() {
//        User user = new User();
//
//        user.setEmail("some@mail.ru");
//
//        boolean isUserCreated = userService.addUser(user);
//
//        Assert.assertTrue(isUserCreated);
//        Assert.assertNotNull(user.getActivationCode());
//        Assert.assertTrue(CoreMatchers.is(user.getRoles()).matches(Collections.singleton(Role.USER)));
//
//        Mockito.verify(userRepo, Mockito.times(1)).save(user);
//        Mockito.verify(mailSender, Mockito.times(1))
//                .send();
//    }
//
//    @Test
//    public void addUserFailTest() {
//        User user = new User();
//        user.setName("Bob");
//
//        Mockito.doReturn(user)
//                .when(userRepo)
//                .findByName("Bob");
//
//        boolean isUserCreated = userService.addUser(user);
//
//        Assert.assertFalse(isUserCreated);
//
//        Mockito.verify(userRepo, Mockito.times(0)).save(ArgumentMatchers.any(User.class));
//        Mockito.verify(mailSender, Mockito.times(0))
//                .send();
//    }
//
//    @Test
//    public void activateUser() {
//        User user = new User();
//        user.setActivationCode("actCode");
//
//        Mockito.doReturn(user)
//                .when(userRepo)
//                .findByActivationCode("activate");
//
//        boolean isUserActivated = userService.activateUser("activate");
//
//        Assert.assertTrue(isUserActivated);
//        Assert.assertNull(user.getActivationCode());
//
//        Mockito.verify(userRepo, Mockito.times(1)).save(user);
//    }
//
//    @Test
//    public void activateUserFailTest() {
//        boolean isUserActivated = userService.activateUser("activate me");
//        Assert.assertFalse(isUserActivated);
//
//        Mockito.verify(userRepo, Mockito.times(0)).save(ArgumentMatchers.any(User.class));
//    }
}
