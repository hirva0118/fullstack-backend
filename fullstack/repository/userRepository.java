package com.CodingWithHirva.fullstack.repository;

import com.CodingWithHirva.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {
}
