package Curso.turma.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;


@Entity
@Table (name = "tb_classe")
public class classe {

	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String descricao;
	
	
	private List <Turmamodel> Turmamodel;
	
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Turmamodel> getPostagem() {
		return Turmamodel;
	}
	
	public void setPostagem(List<Turmamodel>Turmamodel) {
		this.Turmamodel = Turmamodel;
	}
	
	
	
	
}
