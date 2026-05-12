package com.example.service;

import org.springframework.stereotype.Service;

import com.example.UserForm;
import com.example.entity.User;
import com.example.mapper.UserMapper;

@Service
public class UserService {

	private final UserMapper userMapper;

	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public void register(UserForm form) {

		User user = new User();
		user.setName(form.getName());
		user.setEmail(form.getEmail());
		user.setPassword(form.getPassword());
		userMapper.insert(user);
	}
}