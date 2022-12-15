package br.com.cifep.agenda.equipamentos.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "setor")
public class Setor {
	
	public Setor() {}
	public Setor(String setor) {
		this.setor = setor;
	}
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String setor;
 
	@OneToMany(cascade = CascadeType.ALL)
	private List <Reserva> reserva = new ArrayList<Reserva>();
	
	
	
	
 	public String getSetor() {
		return setor;
	}
 	
 	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.setor;
	}

}
