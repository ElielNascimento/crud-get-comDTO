package br.com.crud.backend.service;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.crud.backend.dto.AlunoDTO;
import br.com.crud.backend.entities.Aluno;
import br.com.crud.backend.repository.AlunoRepository;

@Service
public class AlunoService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	public AlunoRepository alunoRepository;

	public List<AlunoDTO> findAll() {
		List<Aluno> list = alunoRepository.findAll();
		return list.stream().map(x -> new AlunoDTO(x)).collect(Collectors.toList());

	}

	public Aluno insert(Aluno aluno) throws Exception {

		if (aluno.getIdade() > 18) {

			throw new Exception("VC É DE MENOR GAROTO");
		}
		return alunoRepository.save(aluno);
	}

}
