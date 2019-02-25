package com.projet6;


import com.projet6.Impl.Compte;
import com.projet6.contrat.CompteDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping({"/compte"})
public class ControllerCompte {
    private CompteDao repository;

    ControllerCompte (CompteDao repository){
        this.repository = repository;
    }

    @GetMapping
    public List findAll(){
        return repository.findAll();

    }

    @GetMapping(path = {"/{id}"})
    public Optional findById(@PathVariable Long id){
        return (Optional) repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Compte create(@RequestBody Compte compte){
        return (Compte) repository.save(compte);
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        return (ResponseEntity<?>) repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
