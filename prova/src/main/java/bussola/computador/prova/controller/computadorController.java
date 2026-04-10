package bussola.computador.prova.controller;

import bussola.computador.prova.model.computador;
import bussola.computador.prova.model.periferico;
import bussola.computador.prova.service.computadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/computador")
public class computadorController {

    @Autowired
    private computadorService ServiceComputador;

    @PostMapping("{id}")
    public ResponseEntity<computador> adicionar(@PathVariable Long id){
        periferico byid = computadorService.(byid);
        return ResponseEntity.ok(byid);
    }

    @PostMapping
    public ResponseEntity<computador> salvar(@RequestBody Computador computador){
        computador = computadorService.save(computador);
        return ResponseEntity.ok(computador);
    }

    @PutMapping("{id}")
    public ResponseEntity<computador> alterar(@RequestBody Computador computador, @PathVariable Long id){
        return computadorService.
    }

    @DeleteMapping("{id}")
    void ResponseEntity<> excluir(@PathVariable ("id") Long id{
        computadorService.deleteById(id);
        return id;
    }

}
