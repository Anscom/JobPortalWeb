package com.anscom.jobportal.repository;

import com.anscom.jobportal.entity.Users;
import com.anscom.jobportal.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {
}
