package com.projet6.controller;

import com.projet6.Impl.Compte;
import com.projet6.Impl.Voie;
import com.projet6.repository.CompteRepository;
import com.projet6.repository.VoieRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/voie"})
public class VoieController {

    private VoieRepository repository;

    VoieController(VoieRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Voie> findAll(){
        return repository.findAll();

    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Voie> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Voie create(@RequestBody Voie voie){
        return repository.save(voie);


    }
/*    @PutMapping(value="/{id}")
    public ResponseEntity<Voie> update(@PathVariable("id") long id,
                                          @RequestBody Voie voie){
        return repository.findById(id)
                .map(record -> {
                    record.setName(contact.getName());
                    record.setEmail(contact.getEmail());
                    record.setPhone(contact.getPhone());
                    Voie updated = repository.save(record);
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
