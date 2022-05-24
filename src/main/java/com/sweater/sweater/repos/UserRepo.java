package com.sweater.sweater.repos;

import com.sweater.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author @bkalika
 * Created on 13.05.2022 12:48 AM
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByName(String name);
}
