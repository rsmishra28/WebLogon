package com.gss.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gss.dao.UserDAO;
import com.gss.model.Users;

@Service
@Transactional
public class UserServiceImpl implements UserService {
     
    @Autowired
    private UserDAO userDAO;
 
    public Users getUser(String login) {
        return userDAO.getUser(login);
    }
 
}