package com.ems.repository;

import com.ems.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<UserRole,Integer> {
}
