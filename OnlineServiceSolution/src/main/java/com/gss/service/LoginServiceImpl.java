package com.gss.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gss.dao.LoginDao;
import com.gss.model.UserRole;
import com.gss.model.Users;


@Service("loginService")
public class LoginServiceImpl implements UserDetailsService {

 @Autowired
 LoginDao loginDao;

 @Override
 public UserDetails loadUserByUsername(String username)
   throws UsernameNotFoundException {
	// username = "user";
	System.out.println("loginService called <--->");
  Users user = loginDao.findByUserName(username); 

  System.out.println("User info : "+user);
  List authorities = buildUserAuthority(user
    .getUserRole());

  return buildUserForAuthentication(user, authorities);
 }

 private User buildUserForAuthentication(Users user,
   List authorities) {
	 System.out.println("buildUserForAuthentication");
  return new User(user.getUsername(), user.getPassword(),
    user.isEnabled(), true, true, true, authorities);
 }

 private List buildUserAuthority(Set<UserRole> userRoles) {

  Set setAuths = new HashSet();

  // Build user's authorities
  for (UserRole userRole : userRoles) {
   setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
  }

  List Result = new ArrayList(setAuths);

  return Result;
 }

}

