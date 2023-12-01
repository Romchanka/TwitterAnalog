package com.example.shop.Repositories;

import com.example.shop.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String usernameOrEmail);

    Optional<Object> findByAdminNameIgnoreCase(String adminName);

    Set<User> findUserByEmail(String email);

    Set<User> findByPhone(String userPhone);
}
