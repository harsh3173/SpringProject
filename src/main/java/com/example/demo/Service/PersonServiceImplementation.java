package com.example.demo.Service;

import com.example.demo.Entity.Person;
import com.example.demo.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImplementation implements PersonService{

    @Autowired
    private PersonRepository repository;

    @Override
    public Integer savePerson(Person person) {
        return repository.save(person).getId();
    }

    @Override
    public List<Person> getAllPersons() {
        return (List<Person>) repository.findAll();
    }

    @Override
    public Person getPersonById(Integer Id) {
        return repository.findById(Id).get();
    }

    @Override
    public void deletePerson(Integer Id) {
        repository.deleteById(Id);

    }
}
