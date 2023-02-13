package br.com.cifep.agenda.equipamentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cifep.agenda.equipamentos.model.Calendario;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

		// findAll ja imbutido
}
