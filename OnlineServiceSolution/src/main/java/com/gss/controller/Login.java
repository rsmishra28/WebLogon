package com.gss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gss.model.Person;
import com.gss.service.PersonService;

//@Controller
public class Login {/*
	
	private PersonService personService;
	@Autowired(required=true)
	@Qualifier(value="personService")
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ModelAndView sayHello(){
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("msg","Mr.Radheshyam");
		mv.setViewName("Welcome");
		System.out.println("-------Hello-------------");
		return  mv;
	}
	
	@RequestMapping(value= "/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("person") Person p){
		System.out.println("Person / Add");
		if(p.getId() == 0){
			//new person, add it
			this.personService.addPerson(p);
		}
		
		return "redirect:/persons";
		
	}
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}
	
*/}
