package Curso.turma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Dados")
public class Turmamodel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size (min = 5, max= 50)
	private String nome;
	

	@NotNull
	@Size (min = 5, max= 50)
	private double numero;
	
	private classe classe;
	
	

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNumero() {
		return numero;
	}
	
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public classe getClasse() {
		return classe;
	}

	public void setClasse(classe classe) {
		this.classe = classe;
	}
}
