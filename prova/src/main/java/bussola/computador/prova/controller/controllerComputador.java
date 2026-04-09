package bussola.computador.prova.controller;

import bussola.computador.prova.model.modelComputador;
import bussola.computador.prova.model.modelPeriferico;
import bussola.computador.prova.service.serviceComputador;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/computador")
public class controllerComputador {

    @Autowired
    private serviceComputador ServiceComputador;

    @GetMapping("{id}")
    public ResponseEntity<modelPeriferico> adicionarPeriferico(@PathVariable Long id){
        modelPeriferico byid = serviceComputador.getById(id);
        return ResponseEntity.ok(byid);
    }

    @PostMapping
    public ResponseEntity<Void> salvarPeriferico(@RequestBody Computador computador){

    }

    @PutMapping("{id}")
    public ResponseEntity<Void> save(@RequestBody Computador computador, @PathVariable Long id){
        return serviceComputador.updatePeriferico
    }


    @DeleteMapping("{id}")
    void deletarPeriferico(){
        serviceComputador.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
