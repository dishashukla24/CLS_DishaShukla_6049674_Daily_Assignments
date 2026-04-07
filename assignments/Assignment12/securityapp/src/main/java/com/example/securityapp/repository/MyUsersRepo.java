package com.example.securityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.securityapp.users.MyUsers;



@Repository
public interface MyUsersRepo extends JpaRepository<MyUsers, String>{

}
