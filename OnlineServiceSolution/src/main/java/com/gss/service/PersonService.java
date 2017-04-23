package com.gss.service;

import java.util.List;

import com.gss.model.Person;

public interface PersonService {
	
	public void addPerson(Person p);
	
	public List<Person> listPersons();
	
	
	
}
