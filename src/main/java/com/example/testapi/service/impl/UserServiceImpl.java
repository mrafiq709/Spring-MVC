package com.example.testapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testapi.model.AppUser;
import com.example.testapi.repository.UserRepository;
import com.example.testapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public AppUser saveUser(AppUser user) {
		return userRepository.save(user);
	}

}
