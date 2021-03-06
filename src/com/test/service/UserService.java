package com.test.service;

import java.io.InputStream;
import java.util.List;

import com.test.bean.User;

public interface UserService {
	
	public void save(User user);
	
	public void delete(User user);
	
	public User findById(Integer id);
	
	public List<User> findAll();
	
	public void update(User user);
	
	public InputStream getInputStream();
	

}
