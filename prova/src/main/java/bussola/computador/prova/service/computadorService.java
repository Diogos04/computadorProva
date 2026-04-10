package bussola.computador.prova.service;

import bussola.computador.prova.repository.repositoryComputador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class computadorService {

    @Autowired
    private repositoryComputador RepositoryComputador;

    public ResponseEntity<computadorService> salvar(Computador computador){
        return repositoryComputador.save(computador);
    }

    public void editarComputador(Computador computador, Long id){
        repositoryComputador exist = repositoryComputador.findById(id).orElseThrow();
        exist.existsById(id);
    }

    @GetMapping
    public List<String> listarComputador(){
        return ResponseEntity.ok(computadorService.listar())
    }

    void deletarComputador(Long id){
        repositoryComputador.deletePorId(id);
    }
}
