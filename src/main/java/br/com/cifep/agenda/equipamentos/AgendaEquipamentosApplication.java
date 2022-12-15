package br.com.cifep.agenda.equipamentos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cifep.agenda.equipamentos.model.Reserva;
import br.com.cifep.agenda.equipamentos.model.Setor;
import br.com.cifep.agenda.equipamentos.repository.ReservaRepository;
import br.com.cifep.agenda.equipamentos.repository.SetorRepository;

@SpringBootApplication
public class AgendaEquipamentosApplication implements CommandLineRunner{

	
	@Autowired
	ReservaRepository reservaRepository;
	
	@Autowired
	SetorRepository setorRepository;
	
	
	

	public static void main(String[] args) {
		
		SpringApplication.run(AgendaEquipamentosApplication.class, args);
		System.out.println("Springboot carregado com sucesso !!!");
		
	}




	
	
	

	@Override
	public void run(String... args) throws Exception {
		
//		Setor setor = new Setor("TECNOLOGIA DA INFORMAÇÃO");
//			setorRepository.save(setor);
//		
//		 List<Setor> setorList = new ArrayList();
//		 setorList.add(setor);
//		 
//		 setorRepository.save(setor);
//		
//		Reserva reserva = new Reserva();
//			reserva.setSolicitante("Bruno");
//			reserva.setDataDaReserva(LocalDate.of(2022, 12, 12));
//			reserva.setHoraInicial(LocalTime.of(10, 00));
//			reserva.setHoraFinal(LocalTime.of(15, 00));
////			reserva.setSetor(setorList);
//			reserva.setEquipamento("DATASHOW");
//			
//			reservaRepository.save(reserva);
//		
//			
//			
//		selects("Bruno");
//			
			
		
	}
	
	
	private void selects(String solicitante) {
		
//		List<Reserva> list =  (List<Reserva>) reservaRepository.findAll();
//		list.forEach(System.out::println);
		
	}
	
	

}

