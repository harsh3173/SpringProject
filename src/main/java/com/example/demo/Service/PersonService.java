package com.example.demo.Service;

import com.example.demo.Entity.Person;

import java.util.List;

public interface PersonService {

    public Integer savePerson(Person person);

    public List<Person> getAllPersons();

    public Person getPersonById(Integer Id);

    public void deletePerson(Integer Id);


}
