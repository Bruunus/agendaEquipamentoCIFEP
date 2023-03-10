package br.com.cifep.agenda.equipamentos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cifep.agenda.equipamentos.model.Reserva;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Long>{

	List<Reserva> findBySolicitante(String solicitante);

	 
	
	
}
