package br.com.crud.backend.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.backend.dto.AlunoDTO;
import br.com.crud.backend.entities.Aluno;
import br.com.crud.backend.service.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	public AlunoService alunoService;

	@GetMapping
	public ResponseEntity<List<AlunoDTO>> findAll() {
		List<AlunoDTO> list = alunoService.findAll();
		return ResponseEntity.ok().body(list);

	}

	@PostMapping
	public Aluno insert(@RequestBody Aluno aluno) throws Exception {
		return alunoService.insert(aluno);
	}

}
