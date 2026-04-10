package bussola.computador.prova.service;

import bussola.computador.prova.repository.repositoryComputador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class perifericoService {


    @Autowired
    private repositoryComputador RepositoryComputador;

    public ResponseEntity<computadorService> salvar(Computador computador){
        return repositoryComputador.save(computador);
    }

    public void editarPeriferico(Computador computador, Long id){
        repositoryComputador exist = repositoryComputador.findById(id).orElseThrow();
        exist.
    }

    @GetMapping
    public List<String> listarPeriferico(){
        return ResponseEntity.ok(computadorService.listar())
    }

    void deletarPeriferico(Long id){
        repositoryPeriferico.deletePorId(id);
    }
}
