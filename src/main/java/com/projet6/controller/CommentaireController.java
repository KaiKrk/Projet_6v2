package com.projet6.controller;

import com.projet6.Impl.Commentaire;
import com.projet6.Impl.Compte;
import com.projet6.repository.CommentaireRepository;
import com.projet6.repository.CompteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/commentaire"})
public class CommentaireController {

    private CommentaireRepository repository;

    CommentaireController(CommentaireRepository repository){
        this.repository = repository;
    }
    @GetMapping
    public List<Commentaire> findAll(){
        return repository.findAll();

    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Commentaire> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Commentaire create(@RequestBody Commentaire commentaire){
        return repository.save(commentaire);


    }
/*    @PutMapping(value="/{id}")
    public ResponseEntity<Commentaire> update(@PathVariable("id") long id,
                                          @RequestBody Commentaire commentaire){
        return repository.findById(id)
                .map(record -> {
                    record.setName(contact.getName());
                    record.setEmail(contact.getEmail());
                    record.setPhone(contact.getPhone());
                    Commentaire updated = repository.save(record);
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
