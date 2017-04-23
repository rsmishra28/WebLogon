package com.gss.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gss.dao.RoleDAO;
import com.gss.model.UserRole;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    
    @Autowired
    private RoleDAO roleDAO;
 
    public UserRole getRole(int id) {
        return roleDAO.getRole(id);
    }
 
}
