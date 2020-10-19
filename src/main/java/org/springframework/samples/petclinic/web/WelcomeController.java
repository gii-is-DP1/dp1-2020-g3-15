package org.springframework.samples.petclinic.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.samples.petclinic.model.Person;
import org.springframework.samples.petclinic.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {
	
	
	  @GetMapping({"/","/welcome"})
	  public String welcome(Map<String, Object> model) {	
		  
		  List<Person> persons=new ArrayList<Person>();
		  Person person=new Person();
		  person.setFirstName("Manuel");
		  person.setLastName("Guerra");
		  persons.add(person);
		  model.put("persons", persons);
		  model.put("title", "G3-15");
		  model.put("group", "G3-15");
		 return "welcome";
	  }
}
