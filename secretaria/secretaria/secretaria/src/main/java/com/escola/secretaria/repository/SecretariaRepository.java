package com.escola.secretaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.escola.secretaria.model.Secretaria;

@Repository
public interface SecretariaRepository extends JpaRepository<Secretaria, Long> {
	public List<Secretaria> findAllByTurmaContainingIgnoreCase(String turma);
	
}
