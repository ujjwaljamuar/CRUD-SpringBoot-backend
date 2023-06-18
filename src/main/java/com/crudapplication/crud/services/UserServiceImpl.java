package com.crudapplication.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.crud.dao.UserDao;
import com.crudapplication.crud.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired     // used to create objects of interfaces
	private UserDao userDao;

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUser(long userId) {
		return userDao.findById(userId).get();
	}

	@Override
	public User addUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User deleteUser(long userId) {
		User user = userDao.findById(userId).get();
		userDao.delete(user);
		return user;
	}
	
	
}
