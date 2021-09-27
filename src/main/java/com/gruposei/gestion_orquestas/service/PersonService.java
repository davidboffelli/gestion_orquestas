package com.gruposei.gestion_orquestas.service;

import com.gruposei.gestion_orquestas.model.Person;
import com.gruposei.gestion_orquestas.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person create(Person p){

        return personRepository.save(p);
    }

    public List<Person> getAllPersons(){

        return personRepository.findAll();
    }

    public void delete(Person p){

        personRepository.delete(p);
    }

    public Optional<Person> findById(Long id){

        return personRepository.findById(id);
    }
}
