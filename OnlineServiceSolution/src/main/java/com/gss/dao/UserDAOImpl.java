package com.gss.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;

import com.gss.model.Person;
import com.gss.model.Users;

@Repository
public class UserDAOImpl implements UserDAO {
     
    @Autowired
    private SessionFactory sessionFactory;
     
    private Session openSession() {
        return sessionFactory.getCurrentSession();
    }
   
    @SuppressWarnings("unchecked")
    public Users getUser(String login) {
        List<Users> userList = new ArrayList<Users>();
        Query query = (Query) openSession().createQuery("from User u where u.login = :login");
        query.setParameter("login", login);
        userList = ((org.hibernate.Query) query).list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;    
    }
   /* @SuppressWarnings("unchecked")
    public User getUser(String login) {
    	Session session = this.sessionFactory.openSession();
        
		List<User> userList =  session.createQuery("from User u where u.login = :login").list();
      //  Query query = (Query) openSession().createQuery("from User u where u.login = :login");
      //  query.setParameter("login", login);
       // userList = query.list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;    
    }*/
 
}
