package com.example.demo.domain.models.entities;

import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

	@Id
	private UUID id;
	
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
	private Conta conta;
	
}
