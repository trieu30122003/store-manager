package com.example.quan_ly_cua_hang.repository;

import com.example.quan_ly_cua_hang.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
}
