package ado;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import model.Person;

@Repository("postgres")
public class PersonDataAccessDB implements PersonDao {

	@Override
	public int insertPerson(UUID id, Person person) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public List<Person> selectAllPeople() {
		// TODO 自動生成されたメソッド・スタブ
		return List.of(new Person(UUID.randomUUID(), "From postgres Database"));
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int deletePersonById(UUID id) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int updatePersonById(UUID id, Person person) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
