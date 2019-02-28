package com.projet6.controller;

import com.projet6.Impl.Compte;
import com.projet6.Impl.Reservation;
import com.projet6.repository.CompteRepository;
import com.projet6.repository.ReservationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/reservation"})
public class ReservationController {

    private ReservationRepository repository;

    ReservationController(ReservationRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Reservation> findAll(){
        return repository.findAll();

    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Reservation> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation){
        return repository.save(reservation);


    }
/*    @PutMapping(value="/{id}")
    public ResponseEntity<Reservation> update(@PathVariable("id") long id,
                                          @RequestBody Reservation reservation){
        return repository.findById(id)
                .map(record -> {
                    record.setName(contact.getName());
                    record.setEmail(contact.getEmail());
                    record.setPhone(contact.getPhone());
                    Reservation updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }*/

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
