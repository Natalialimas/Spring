package com.escola.secretaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.escola.secretaria.model.Secretaria;
import com.escola.secretaria.repository.SecretariaRepository;

@RestController
@RequestMapping ("/Secretaria")
@CrossOrigin ("*")
public class SecretariaController {

	@Autowired
	private SecretariaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Secretaria>> GetAll(){
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") 														//Defini que irei receber como um parametro atravez da URL //localhost:8080/turma/2  <-- o Numero 2 é o parametro
 	public ResponseEntity<Secretaria> GetById(@PathVariable long id){  				// @PathVariable infoma que o valor virá da URL como paramentro
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build()); 					// Metodo Map retorma uma valor do tipo turma e caso exista ele retorna um objeto do tipo 200 OK e caso não exista ele retorna um badResquest 404
	}

	
	@GetMapping("/Secretaria/{Secretaria}")
	public ResponseEntity<List<Secretaria>> GetBySecretaria(@PathVariable String Secretaria){
		return ResponseEntity.ok(repository.findAllByTurmaContainingIgnoreCase(Secretaria));
	}
	
	@PostMapping
	public ResponseEntity<Secretaria> post (@RequestBody Secretaria secretaria){		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(secretaria));
	}	
	
	@PutMapping
	public ResponseEntity<Secretaria> put (@RequestBody Secretaria secretaria){		
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(secretaria));
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){		
		repository.deleteById(id);
	}
}
