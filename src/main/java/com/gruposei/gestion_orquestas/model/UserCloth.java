package com.gruposei.gestion_orquestas.model;

import javax.persistence.*;

@Entity
@Table(name = "users_clothes")
public class UserCloth {

    @EmbeddedId
    private UserClothKey id = new UserClothKey();

    @ManyToOne(optional = false)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @MapsId("clothId")
    @JoinColumn(name = "cloth_id")
    private Cloth cloth;

    private String size;

    public UserCloth() {
    }

    public UserClothKey getId() {
        return id;
    }

    public void setId(UserClothKey id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
