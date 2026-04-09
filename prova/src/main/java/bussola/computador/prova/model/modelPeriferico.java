package bussola.computador.prova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Entity
@Repository
public class modelPeriferico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String periferico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriferico() {
        return periferico;
    }

    public void setPeriferico(String periferico) {
        this.periferico = periferico;
    }

    public modelPeriferico(String periferico) {
        this.periferico = periferico;
    }
}
