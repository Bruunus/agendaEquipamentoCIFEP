package br.com.cifep.agenda.equipamentos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "equipamento")
public class Equipamento {
	

	public Equipamento() {}
	
	

//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeEquipamento;
	
	private String marcaEquipamento;
	
//	@ManyToOne
	private Reserva reservaEquipamento;

	
	
	// session's getters
	
	public Long getId() {
		return id;
	}

	public String getNomeEquipamento() {
		return nomeEquipamento;
	}

	public String getMarcaEquipamento() {
		return marcaEquipamento;
	}
	
	
	// session's setters

	public void setId(Long id) {
		this.id = id;
	}

	public void setNomeEquipamento(String nomeEquipamento) {
		this.nomeEquipamento = nomeEquipamento;
	}

	public void setMarcaEquipamento(String marcaEquipamento) {
		this.marcaEquipamento = marcaEquipamento;
	}
	
	
	
	
}
