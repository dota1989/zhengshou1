package com.service;

import java.util.Set;

import com.bo.Permission;
import com.bo.Role;
import com.bo.User;

public interface UserService {
	
	User findByUsername(String username);
	
	Set<Role> findRoles(String username);
	
	Set<Permission> findPermissions(String username);
}
