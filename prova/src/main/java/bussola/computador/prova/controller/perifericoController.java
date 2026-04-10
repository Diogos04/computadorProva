package bussola.computador.prova.controller;

import bussola.computador.prova.model.periferico;
import bussola.computador.prova.service.computadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class perifericoController {

    @Autowired
    private computadorService ServiceComputador;

    @PostMapping("{id}")
    public ResponseEntity<periferico> adicionarPeriferico(@PathVariable Long id){
        periferico byid = computadorService.(id);
        return ResponseEntity.ok(byid);
    }

    @PostMapping
    public ResponseEntity<periferico> salvarPeriferico(@RequestBody Computador computador){

    }

    @PutMapping("{id}")
    public ResponseEntity<periferico> save(@RequestBody Computador computador, @PathVariable Long id){
        return updatePeriferico
    }


    @DeleteMapping("{id}")
    void deletarPeriferico(@PathVariable ("id") Long id){
        computadorService.deleteById(id);
    }

}
