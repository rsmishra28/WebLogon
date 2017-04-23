package com.gss.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gss.model.UserRole;

@Repository
public class RoleDAOImpl implements RoleDAO {
     
    @Autowired
    private SessionFactory sessionFactory;
     
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
 
    public UserRole getRole(int id) {
        UserRole role = (UserRole) getCurrentSession().load(UserRole.class, id);
        return role;
    }
 
}
