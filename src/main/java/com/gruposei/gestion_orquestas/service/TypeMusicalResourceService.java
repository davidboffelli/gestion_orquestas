package com.gruposei.gestion_orquestas.service;

import com.gruposei.gestion_orquestas.model.TypeMusicalResource;
import com.gruposei.gestion_orquestas.repositories.TypeMusicalResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeMusicalResourceService {

    @Autowired
    private TypeMusicalResourceRepository typeMusicalResourceRepository;

    public TypeMusicalResource create(TypeMusicalResource p){

        return typeMusicalResourceRepository.save(p);
    }

    public List<TypeMusicalResource> getAll(){

        return typeMusicalResourceRepository.findAll();
    }

    public void delete(TypeMusicalResource p){

        typeMusicalResourceRepository.delete(p);
    }

    public void deleteById(Long id){

        typeMusicalResourceRepository.deleteById(id);
    }

    public Optional<TypeMusicalResource> findById(Long id){

        return typeMusicalResourceRepository.findById(id);
    }
}
