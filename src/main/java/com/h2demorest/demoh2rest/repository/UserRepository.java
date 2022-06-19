package com.h2demorest.demoh2rest.repository;

import com.h2demorest.demoh2rest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long > {
}
