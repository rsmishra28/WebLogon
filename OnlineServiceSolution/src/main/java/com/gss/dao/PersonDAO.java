package com.gss.dao;

import java.util.List;

import com.gss.model.Person;

public interface PersonDAO {
	public void addPerson(Person p);
	
	public List<Person> listPersons();
	
}
