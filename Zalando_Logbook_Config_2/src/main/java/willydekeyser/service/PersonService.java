package willydekeyser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import willydekeyser.entity.Person;

@Service
public class PersonService {
	
	public List<Person> getAllPerson() {
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(new Person(1, "Bill", "Smith", "password1", 20));
		listPerson.add(new Person(2, "Wendy", "Roberts", "password2", 28));
		listPerson.add(new Person(3, "Fanny", "Williams", "password3", 35));
		return listPerson;
		
	}

}
