package com.example.stockstream.DAL;

import com.example.stockstream.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
