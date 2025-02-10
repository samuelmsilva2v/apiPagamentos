package com.example.demo.domain.models.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

	@Id
	private UUID id;
	
	private String nome;
	private String email;
	
	// TODO private Conta conta;
	
}
