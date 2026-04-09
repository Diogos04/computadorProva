package bussola.computador.prova.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@Entity
@Repository
public class modelComputador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cor;
    private Integer dataFabricacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Integer dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public modelComputador() {
    }
}
