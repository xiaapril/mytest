package com.test.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.User;
import com.test.service.UserService;

public class UpdatePUserAction extends ActionSupport {
	private User user;
	private UserService service;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getService() {
		return service;
	}
	public void setService(UserService service) {
		this.service = service;
	}
	
	public String execute() throws Exception{
		user=this.service.findById(user.getId());
		return SUCCESS;
	}
}
