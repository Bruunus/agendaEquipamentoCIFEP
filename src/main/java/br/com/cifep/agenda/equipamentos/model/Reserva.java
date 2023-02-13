package br.com.cifep.agenda.equipamentos.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "reserva")
public class Reserva {

	public Reserva() {}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String solicitante;
	
	
	private LocalDate dataDaReserva;
	private LocalDate dataDaDevolucao;
	private LocalTime horaInicial;
	private LocalTime horaFinal;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "setor")
	private Setor setor;
	
	

	private String equipamento;	 
	
	private String outroEquipamento; 	 
	
	
	
	// session's getters
	
	public Long getId() {
		return id;
	}
	
	public String getSolicitante() {
		return solicitante;
	}
	
	public LocalDate getDataDaReserva() {
		return dataDaReserva;
	}
	
	public LocalTime getHoraInicial() {
		return horaInicial;
	}
	
	public LocalTime getHoraFinal() {
		return horaFinal;
	}
	
	
	// session's setters
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	
	public void setDataDaReserva(LocalDate dataDaReserva) {
		this.dataDaReserva = dataDaReserva;
	}
	
	public void setHoraInicial(LocalTime horaInicial) {
		this.horaInicial = horaInicial;
	}
	
	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}

 

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public String getOutroEquipamento() {
		return outroEquipamento;
	}

	public void setOutroEquipamento(String outroEquipamento) {
		this.outroEquipamento = outroEquipamento;
	}

	
	
 
	public Setor getSetor() {	
		
		return this.setor;
	}

	public void setSetor(Setor setor) {
		
		this.setor = setor;
		
	}

	 
 
	@Override
	public String toString() {
		
		return "" + this.setor;
		
	}

	public LocalDate getDataDaDevolucao() {
		return dataDaDevolucao;
	}

	public void setDataDaDevolucao(LocalDate dataDaDevolucao) {
		this.dataDaDevolucao = dataDaDevolucao;
	}
	
	
	
}
