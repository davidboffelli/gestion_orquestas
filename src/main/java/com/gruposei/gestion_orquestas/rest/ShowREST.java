package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Role;
import com.gruposei.gestion_orquestas.model.Show;
import com.gruposei.gestion_orquestas.service.RoleService;
import com.gruposei.gestion_orquestas.service.ShowService;
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
@RequestMapping("/api/shows")
public class ShowREST {

    @Autowired
    private ShowService showService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping
    private ResponseEntity<Show> save(@RequestBody Show p){

        Show temporal = showService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/shows" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Show>> getAll(){

        return ResponseEntity.ok(showService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        showService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<Show>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(showService.findById(id));
    }
}
