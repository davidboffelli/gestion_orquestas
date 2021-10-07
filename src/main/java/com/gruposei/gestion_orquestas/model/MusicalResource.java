package com.gruposei.gestion_orquestas.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "musical_resources")
public class MusicalResource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    @Lob
    private String content;
    @ManyToOne(optional = false)
    @JoinColumn(name = "song_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Song song;
    @ManyToOne(optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private TypeMusicalResource typeMusicalResource;

    public MusicalResource() {
    }

    public MusicalResource(Long id, String name, String description, String content, Song song, TypeMusicalResource typeMusicalResource) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.content = content;
        this.song = song;
        this.typeMusicalResource = typeMusicalResource;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public TypeMusicalResource getTypeMusicalResource() {
        return typeMusicalResource;
    }

    public void setTypeMusicalResource(TypeMusicalResource typeMusicalResource) {
        this.typeMusicalResource = typeMusicalResource;
    }
}
