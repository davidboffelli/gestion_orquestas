package com.gruposei.gestion_orquestas.model;

import javax.persistence.*;

@Entity
@Table(name = "musical_resources_types")
public class TypeMusicalResource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public TypeMusicalResource() {
    }

    public TypeMusicalResource(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
