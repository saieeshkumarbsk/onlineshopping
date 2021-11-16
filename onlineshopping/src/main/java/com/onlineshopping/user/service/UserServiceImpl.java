package com.onlineshopping.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlineshopping.user.dao.UserRepository;
import com.onlineshopping.user.entity.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;


}
