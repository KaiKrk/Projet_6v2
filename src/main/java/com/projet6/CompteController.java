package com.projet6;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




}
