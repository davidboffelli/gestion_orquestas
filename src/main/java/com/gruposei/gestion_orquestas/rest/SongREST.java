package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Show;
import com.gruposei.gestion_orquestas.model.Song;
import com.gruposei.gestion_orquestas.service.ShowService;
import com.gruposei.gestion_orquestas.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/songs")
public class SongREST {

    @Autowired
    private SongService songService;

    @PostMapping
    private ResponseEntity<Song> save(@RequestBody Song p){

        Song temporal = songService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/songs" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Song>> getAll(){

        return ResponseEntity.ok(songService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        songService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<Song>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(songService.findById(id));
    }
}
