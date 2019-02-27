package com.projet6.controller;




import com.projet6.Impl.Compte;
import com.projet6.repository.CompteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping({"/compte"})
public class CompteController {

    private CompteRepository repository;

    CompteController(CompteRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Compte> findAll(){
        return repository.findAll();

    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Compte> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Compte create(@RequestBody Compte compte){
        return repository.save(compte);


    }
/*    @PutMapping(value="/{id}")
    public ResponseEntity<Compte> update(@PathVariable("id") long id,
                                          @RequestBody Compte contact){
        return repository.findById(id)
                .map(record -> {
                    record.setName(contact.getName());
                    record.setEmail(contact.getEmail());
                    record.setPhone(contact.getPhone());
                    Compte updated = repository.save(record);
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
