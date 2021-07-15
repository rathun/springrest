package com.cognizant.iptm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.iptm.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
