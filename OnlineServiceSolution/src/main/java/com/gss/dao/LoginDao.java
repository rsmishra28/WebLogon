package com.gss.dao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.gss.model.Users;

public interface LoginDao {
 Users findByUserName(String username);

}

