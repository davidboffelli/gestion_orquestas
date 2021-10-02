package com.gruposei.gestion_orquestas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean enabled;

//    @JsonIgnore
//    @ManyToMany
//    @JoinTable(name="users_roles",
//            joinColumns = @JoinColumn(name = "role_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id"))
    @ManyToMany(mappedBy = "rolesUser")
    private List<User> usersRole = new ArrayList<>();

    public Role() {
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void addUser(User user){

        usersRole.add(user);
    }
//    public Set<Optional<User>> getEnrolledUsers() {
//        return enrolledUsers;
//    }
//
//    public void enrollUsers(Optional<User> user) {
//
//        enrolledUsers.add(user);
//    }
}
