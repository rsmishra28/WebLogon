package com.gss.dao;

import com.gss.model.Users;

public interface UserDAO {
    
    public Users getUser(String login);
 
}