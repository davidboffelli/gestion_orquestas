package com.gruposei.gestion_orquestas.service;

import com.gruposei.gestion_orquestas.model.Users;
import com.gruposei.gestion_orquestas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users create(Users p){

        return userRepository.save(p);
    }

    public List<Users> getAllUsers(){

        return userRepository.findAll();
    }

    public void delete(Users p){

        userRepository.delete(p);
    }

    public Optional<Users> findById(Long id){

        return userRepository.findById(id);
    }

    public Optional<Users> findByUsername(String username){

        return userRepository.findByUsername(username);
    }
}
