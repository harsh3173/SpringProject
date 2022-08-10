package com.example.demo.controller;

import com.example.demo.Entity.Person;
import com.example.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;


    @PostMapping("/savePerson")
    public ResponseEntity<String> savePerson(@RequestBody Person person) {
        Integer pid = service.savePerson(person);
        String res = "Person with id: " + pid + " added to DB " + person.getName() + " " + person.getGoldBonds() +  "." ;
        return new ResponseEntity<String>(res, HttpStatus.OK);
    }
    @GetMapping("/personList")
    public ResponseEntity<List<Person>> getAllPersonDetails() {
        List<Person> list = service.getAllPersons();
        return new ResponseEntity<List<Person>>(list, HttpStatus.OK);
    }
    @GetMapping("/personById/{Id}")
    public ResponseEntity<Person> getPersonById(@PathVariable("Id")  Integer Id) {
        Person person = service.getPersonById(Id);
        return new ResponseEntity<Person>(person,HttpStatus.OK);
    }

//    @PutMapping("/updatePerson/{Id}")
//    public ResponseEntity<String> updatePerson(@PathVariable("Id") Integer Id, @RequestBody Person person ) {
//        Person personDB = service.getPersonById(Id);
//        personDB.setName(person.getName());
//        personDB.setGoldBonds(person.getGoldBonds());
//        service.savePerson(personDB);
//        String res = "Person with " + personDB.getId() + " updated in DB.";
//        return new ResponseEntity<String>(res,HttpStatus.OK);
//    }
//
//    @DeleteMapping("/deletePerson/{Id}")
//    public ResponseEntity<String> deletePerson(@PathVariable("Id") Integer Id) {
//        service.deletePerson(Id);
//        String res = "Person with id :" + Id + " has been deleted.";
//        return new ResponseEntity<String>(res, HttpStatus.OK);
//
//    }

}
