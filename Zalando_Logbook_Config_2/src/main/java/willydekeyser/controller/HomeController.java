package willydekeyser.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import willydekeyser.entity.Person;
import willydekeyser.service.PersonService;

@RestController
public class HomeController {
	
	private final PersonService personService;
	
	public HomeController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/")
	public String home() {
		return "Zalando Logbook!";
	}
	
	@GetMapping("/person")
	public Person getPerson() {
		return personService.getAllPerson().get(1);
	}
	
	@GetMapping("/allperson")
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}

}
