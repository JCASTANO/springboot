package co.com.mycompany.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.mycompany.domain.Person;
import co.com.mycompany.repository.MysqlPersonRepository;
import co.com.mycompany.service.PersonService;

@RestController
@RequestMapping("/web/api/person")
public class PersonController {

	private PersonService personService;
	
	public PersonController() {
		this.personService = new PersonService(new MysqlPersonRepository());
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Person login() {
		return this.personService.find();
	}
}
