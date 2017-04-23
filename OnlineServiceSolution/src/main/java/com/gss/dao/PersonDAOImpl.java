package com.gss.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gss.model.Person;

public class PersonDAOImpl implements PersonDAO{
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addPerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		for(Person p : personsList){
			System.out.println("Name : "+p.getName());
		}
		return personsList;
	}

	
}
