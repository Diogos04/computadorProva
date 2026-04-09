package bussola.computador.prova.repository;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reporitoryPeriferico extends JpaRepository<Integer, Id> {
}
