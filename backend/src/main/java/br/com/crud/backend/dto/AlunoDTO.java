package br.com.crud.backend.dto;

import br.com.crud.backend.entities.Aluno;

public class AlunoDTO {

	private Long id;
	private String name;
	private String cpf;

	public AlunoDTO(Long id, String name, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}

	public AlunoDTO(Aluno entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
