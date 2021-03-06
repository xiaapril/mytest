package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.User;
import com.test.dao.UserDAO;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers(){
		
		String hql="from User user order by user.id desc";
		return (List<User>)this.getHibernateTemplate().find(hql);
		
	}

	
	public User findUserById(Integer id) {
		
		User user=(User)this.getHibernateTemplate().get(User.class, id);
		return user;
	}

	
	public void removeUser(User user) {
		
		this.getHibernateTemplate().delete(user);
	}

	
	public void saveUser(User user) {
		
			this.getHibernateTemplate().save(user);
	}

	
	public void updateUser(User user) {
		
		this.getHibernateTemplate().update(user);

	}

}
