package br.com.cifep.agenda.equipamentos.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cifep.agenda.equipamentos.model.Reserva;
import br.com.cifep.agenda.equipamentos.model.Setor;

@Controller
//@RequestMapping("/home")
public class HomeController {
	
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		
		request.setAttribute("thymeleaf", "Thymeleaf é toper!!!!!!");
		System.out.println("Conexão de Java com sucesso !!!");
		
		return "home";
		
	}
	
	
	
	/**
	 * Puxando os dados de um objeto comum java
	 * @param request
	 * @param model
	 * @return
	 */
	@GetMapping("/reservas")
	public String reservas(HttpServletRequest request, Model model) {
		
		Reserva reserva = new Reserva();
		reserva.setSolicitante("Bruno Fernandes");
		reserva.setSetor(new Setor("TECNOLOGIA DA INFORMAÇÃOoooo"));
		reserva.setDataDaReserva(LocalDate.of(2022, 12, 15));
		reserva.setHoraInicial(LocalTime.of(9, 00));
		reserva.setHoraFinal(LocalTime.of(15, 00));
		reserva.setEquipamento("DATASHOW");
		
		List<Reserva> reservas = Arrays.asList(reserva);
		
		reservas.forEach(System.out::println);
		
		model.addAttribute("reserva", reservas);
		
		return "null";
		
	}
	
	
	
	/**
	 * Puxando os dados do banco de dados direto
	 * @param request
	 * @param model
	 * @return
	 */
	@GetMapping("/reservasDB")
	public String reservasDB(HttpServletRequest request, Model model) {
		
		Query query = entityManager.createQuery("SELECT r FROM Reserva r", Reserva.class);
		
		@SuppressWarnings("unchecked")
			List<Reserva> reservas = query.getResultList();
		
		model.addAttribute("reserva", reservas);
		
		return "/agenda/reservas";
		
	}
}
