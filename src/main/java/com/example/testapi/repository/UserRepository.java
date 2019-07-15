package com.example.testapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testapi.model.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
	public Optional<AppUser> findByUsername(String name);
}
