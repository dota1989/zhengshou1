package com.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.bo.Permission;
import com.bo.Role;
import com.bo.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User findByUsername(String username) {
		User user = new User();
		user.setUsername(username);
		user.setPassword("123456");
		user.setLocked(1);
		user.setCredentialsSalt("ZS");
		return user;
	}

	@Override
	public Set<Role> findRoles(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Permission> findPermissions(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
