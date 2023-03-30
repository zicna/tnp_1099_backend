package com.zicna_inc.tnp_1099;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zicna_inc.tnp_1099.entity.Gender;
import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.repository.UserRepository;
import com.zicna_inc.tnp_1099.service.UserService;

@SpringBootApplication
public class Tnp1099Application implements CommandLineRunner{

	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(Tnp1099Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User dummyUser = new User("ruby_master@example.com", new Date(), Gender.FEMALE);
		userRepo.save(dummyUser);
	}
}
