package br.com.cifep.agenda.equipamentos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calendario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String mes;

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getMes() + " ";
	}
	
}
