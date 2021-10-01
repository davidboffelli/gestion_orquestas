package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Role;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.service.RoleService;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RoleREST {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping
    private ResponseEntity<Role> save(@RequestBody Role p){

        Role temporal = roleService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/roles" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Role>> getAll(){

        return ResponseEntity.ok(roleService.getAll());
    }

    @DeleteMapping
    private ResponseEntity<Void> delete(@RequestBody Role p){

        roleService.delete(p);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<Role>> getByName(@RequestParam("id") Long id) {
        return ResponseEntity.ok(roleService.findById(id));
    }

    @RequestMapping(params = "name")
    public ResponseEntity<Optional<Role>> getByLastname(@RequestParam("name") String name) {
        return ResponseEntity.ok(roleService.findByName(name));
    }

//    @PutMapping("/{roleID}/users/{userID}")
//    public Role enrollUsersToRole(@PathVariable Long roleID,@PathVariable Long userID){
//
//        Optional<Role> role = roleService.findById(roleID);
//        Optional<User> user = userService.findById(userID);
//        //role.enrollUsers(user);
//        role.get().enrollUsers(user);
//        return roleService.create(role.get());
//    }
}
