package com.talzoo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.talzoo.DataNotFoundException;
import com.talzoo.model.SiteUser;
import com.talzoo.model.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	private final PasswordEncoder passwordEncoder; // 추가
	
	@Autowired
	public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository=userRepository;
		this.passwordEncoder=passwordEncoder; //추가
	}

	    public SiteUser create(String username, String email, String password) {
	    	SiteUser user = new SiteUser();
	    	user.setUsername(username);
	        user.setEmail(email);
	        user.setPassword(passwordEncoder.encode(password));
	        this.userRepository.save(user);
	        return user;
	    }
	    
	    public SiteUser getUser(String username) {
	        Optional<SiteUser> siteUser = this.userRepository.findByusername(username);
	        if (siteUser.isPresent()) {
	            return siteUser.get();
	        } else {
	            throw new DataNotFoundException("siteuser not found");
	        }
	    }
}
