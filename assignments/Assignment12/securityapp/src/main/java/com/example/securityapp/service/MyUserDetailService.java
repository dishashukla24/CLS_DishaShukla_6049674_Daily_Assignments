package com.example.securityapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.securityapp.repository.MyUsersRepo;
import com.example.securityapp.users.MyUsers;


@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	MyUsersRepo myUserRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUsers> op= myUserRepo.findById(username);
				
		if(op.isPresent()) {
			MyUsers user=op.get();
			return new MyUserDetail(user);
		}
		else
			throw new UsernameNotFoundException("User Not Found");
		// TODO Auto-generated method stub
		
	}

}
