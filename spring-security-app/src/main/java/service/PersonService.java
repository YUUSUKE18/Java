package service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ado.PersonDao;
import model.Person;

@Service
public class PersonService {

	private final PersonDao personDao;
	//constructor
	@Autowired
	public PersonService(@Qualifier("fakeDao")PersonDao personDao) {
		this.personDao = personDao;
	}
	//insert DB!!
	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}

	//Grab data list
	public List<Person> getAllPeople(){
		return personDao.selectAllPeople();
	}

	public Optional<Person> getPersonById(UUID id) {
		return personDao.selectPersonById(id);

	}

	public int deletePerson(UUID id) {
		return personDao.deletePersonById(id);
	}

	public int updatePerson(UUID id, Person newPerson) {
		return personDao.updatePersonById(id, newPerson);
	}

}
