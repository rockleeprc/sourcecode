package com.bee.sample.ch3.service;

import java.util.List;

import com.bee.sample.ch3.entity.User;

public interface UserService {
	public List<User> allUser();
	public User getUserById(Long id);
	public void updateUser(Long id,Integer type);
}
