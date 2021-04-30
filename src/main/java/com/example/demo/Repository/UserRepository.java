package com.example.demo.Repository;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//user資料表的repository，做資料庫CRUD操作
public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);
}
