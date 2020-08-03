package Curso.turma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Curso.turma.model.Turmamodel;

@Repository
public interface TurmaRepository extends JpaRepository<Turmamodel, Long>{

	public List<Turmamodel> findAllByNomeContainingIgnoreCase(String nome);
	
}
