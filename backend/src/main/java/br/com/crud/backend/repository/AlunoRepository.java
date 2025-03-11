package br.com.crud.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.backend.entities.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
