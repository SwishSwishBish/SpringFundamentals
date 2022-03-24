package com.sena.controller;

import com.sena.entity.Person;
import com.sena.repository.PersonRepository;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/person")
public class PersonAPI {
    private final PersonRepository personRepository;

//    public PersonAPI(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }  //--> or @RequiredArgsConstructor

    @PostConstruct
    public void init(){
        Person person = new Person();
        person.setId("M270005");
        person.setName("Maria");
        person.setLastname("Dobie");
        person.setAddress("New York");
        person.setBirthday(new GregorianCalendar(1992, Calendar.JUNE,22).getTime());
        personRepository.save(person);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getPerson(@PathVariable String search) {
        List<Person> personList = personRepository.findByNameLikeOrLastnameLike(search, search);
            return ResponseEntity.ok(personList);
    }
}