package com.gruposei.gestion_orquestas.service;

import com.gruposei.gestion_orquestas.model.Cloth;
import com.gruposei.gestion_orquestas.model.ClothScale;
import com.gruposei.gestion_orquestas.repositories.ClothRepository;
import com.gruposei.gestion_orquestas.repositories.ClothScaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothScaleService {

    @Autowired
    private ClothScaleRepository clothScaleRepository;

    public ClothScale create(ClothScale p){

        return clothScaleRepository.save(p);
    }

    public List<ClothScale> getAll(){

        return clothScaleRepository.findAll();
    }

    public void delete(ClothScale p){

        clothScaleRepository.delete(p);
    }

    public void deleteById(Long id){

        clothScaleRepository.deleteById(id);
    }

    public Optional<ClothScale> findById(Long id){

        return clothScaleRepository.findById(id);
    }
}
