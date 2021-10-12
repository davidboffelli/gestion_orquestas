package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Song;
import com.gruposei.gestion_orquestas.model.UserCloth;
import com.gruposei.gestion_orquestas.model.UserClothKey;
import com.gruposei.gestion_orquestas.service.UserClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users_clothes")
public class UserClothREST {

    @Autowired
    private UserClothService userClothService;

    @PostMapping
    private ResponseEntity<UserCloth> save(@RequestBody UserCloth p){

        UserCloth temporal = userClothService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/users_clothes" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<UserCloth>> getAll(){

        return ResponseEntity.ok(userClothService.getAll());
    }

    @DeleteMapping(params = {"user_id","cloth_id"})
    public ResponseEntity<Void> deleteById(@RequestParam("user_id") Long user_id,@RequestParam("cloth_id") Long cloth_id) {
        UserClothKey userClothKey = new UserClothKey();
        userClothKey.setUserId(user_id);
        userClothKey.setClothId(cloth_id);
        userClothService.deleteById(userClothKey);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = {"user_id","cloth_id"})
    public ResponseEntity<Optional<UserCloth>> getById(@RequestParam("user_id") Long user_id,@RequestParam("cloth_id") Long cloth_id) {
        UserClothKey userClothKey = new UserClothKey();
        userClothKey.setUserId(user_id);
        userClothKey.setClothId(cloth_id);
        return ResponseEntity.ok(userClothService.findById(userClothKey));
    }
}
