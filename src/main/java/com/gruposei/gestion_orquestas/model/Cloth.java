package com.gruposei.gestion_orquestas.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clothes")
public class Cloth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String size_scale;

    public Cloth() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String version) {
        this.description = version;
    }

    public String getSize_scale() {
        return size_scale;
    }

    public void setSize_scale(String size_scale) {
        this.size_scale = size_scale;
    }
}
