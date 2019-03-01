package com.projet6.controller;

import com.projet6.Impl.Compte;
import com.projet6.Impl.Topo;
import com.projet6.repository.CompteRepository;
import com.projet6.repository.TopoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/topo"})
public class TopoController {

    private TopoRepository repository;

    TopoController(TopoRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Topo> findAll(){
        return repository.findAll();

    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Topo> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Topo create(@RequestBody Topo topo){
        return repository.save(topo);


    }
   @PutMapping(value="/{id}")
    public ResponseEntity<Topo> update(@PathVariable("id") long id,
                                          @RequestBody Topo topo){
        return repository.findById(id)
                .map(record -> {
                    record.setRegion(topo.getRegion());
                    record.setPays(topo.getPays());
                    record.setStatutTopo(topo.getStatutTopo());
                    record.setTopoFile(topo.getTopoFile());
                    Topo updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
