package com.example.testapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.testapi.model.AppUser;
import com.example.testapi.model.Role;
import com.example.testapi.service.UserService;

@SpringBootApplication
public class SpringbootLoginMysqlApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoginMysqlApplication.class, args);
	}

	/*
	 * This method will run during application startup and execute all the codes inside this method
	 * 
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Remove or comment this part after first execution of application, 
				//or else duplicate data will be inserted in the database
				/*
				AppUser admin = new AppUser();
				admin.setActive(true);
				admin.setPassword(encoder.encode("password"));
				admin.setUsername("admin");
				admin.setRoles(Arrays.asList(new Role("ADMIN")));
				userService.saveUser(admin);
				
				AppUser user = new AppUser();
				user.setActive(true);
				user.setPassword(encoder.encode("password"));
				user.setUsername("user");
				user.setRoles(Arrays.asList(new Role("USER")));
				userService.saveUser(user);
				
				
		*/
	}

}
