package com.crudapplication.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudapplication.crud.model.User;

@Service
public interface UserService {
public List<User> getUsers();
	
	public User getUser(long userId);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public User deleteUser(long userId);
}
