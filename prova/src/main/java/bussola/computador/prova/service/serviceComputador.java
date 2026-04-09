package bussola.computador.prova.service;

import bussola.computador.prova.controller.controllerComputador;
import bussola.computador.prova.repository.repositoryComputador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class serviceComputador {

    @Autowired
    private repositoryComputador RepositoryComputador;
    private repositoryPeriferico RepositoryPeriferico;

    public void salvarPeriferico(Periferico periferico){
        return repositoryComputador.save(periferico);
    }

    public void editarPeriferico(Periferico periferico, Long id){
        RepositoryPeriferico exist = repositoryComputador.findById(id).orElseThrow();
        exist.
    }

    public List<String> listarPeriferico(){

    }

    void deletarPeriferico(Long id){
        repositoryComputador.deleteId(id);
    }
}
