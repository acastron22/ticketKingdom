package br.com.ticketkingdom.ticketkingdom.repository;

import br.com.ticketkingdom.ticketkingdom.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngressoRepository extends JpaRepository<Ingresso, String > {

    List<Ingresso> findByEvento(String evento);
}
