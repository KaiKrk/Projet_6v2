package com.projet6.controller;

import com.projet6.Impl.Compte;
import com.projet6.Impl.Secteur;
import com.projet6.repository.CompteRepository;
import com.projet6.repository.SecteurRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/secteur"})
public class SecteurController {

    private SecteurRepository repository;

    SecteurController(SecteurRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Secteur> findAll(){
        return repository.findAll();

    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Secteur> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Secteur create(@RequestBody Secteur secteur){
        return repository.save(secteur);


    }
/*    @PutMapping(value="/{id}")
    public ResponseEntity<Secteur> update(@PathVariable("id") long id,
                                          @RequestBody Secteur secteur){
        return repository.findById(id)
                .map(record -> {
                    record.setName(contact.getName());
                    record.setEmail(contact.getEmail());
                    record.setPhone(contact.getPhone());
                    Secteur updated = repository.save(record);
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
