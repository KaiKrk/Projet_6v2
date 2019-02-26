package com.projet6;


import com.projet6.Impl.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping({"/compte"})
public class ControllerCompte {
    @Autowired
    private CompteRepository repository;

    ControllerCompte(CompteRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Compte> findAll(){
        return repository.findAll();

    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Compte> findById(@PathVariable Long id){
        return  repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }


}
