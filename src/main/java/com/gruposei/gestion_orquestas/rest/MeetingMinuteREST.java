package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Cloth;
import com.gruposei.gestion_orquestas.model.MeetingMinute;
import com.gruposei.gestion_orquestas.service.MeetingMinuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/meeting_minutes")
public class MeetingMinuteREST {

    @Autowired
    private MeetingMinuteService meetingMinuteService;

    @PostMapping
    private ResponseEntity<MeetingMinute> save(@RequestBody MeetingMinute p){

        MeetingMinute temporal = meetingMinuteService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/meeting_minutes" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<MeetingMinute>> getAll(){

        return ResponseEntity.ok(meetingMinuteService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        meetingMinuteService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<MeetingMinute>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(meetingMinuteService.findById(id));
    }
}
