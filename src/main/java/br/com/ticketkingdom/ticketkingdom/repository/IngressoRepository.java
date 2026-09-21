package br.com.ticketkingdom.ticketkingdom.repository;

import br.com.ticketkingdom.ticketkingdom.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRepository extends JpaRepository<Ingresso, String > {
}
